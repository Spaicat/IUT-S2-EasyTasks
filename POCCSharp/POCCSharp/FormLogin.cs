using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

//Librairie MySQL à ajouter
using MySql.Data.MySqlClient;

namespace POCCSharp
{
    public partial class FormLogin : Form
    {
        public FormLogin()
        {
            InitializeComponent();
        }

        MySqlConnection connexion;

        private void button1_Click(object sender, EventArgs e)
        {
            connexion = new MySqlConnection("database=projs2; server=localhost; user id=root");

            try
            {
                connexion.Open();

                string queryUser = "SELECT * FROM Utilisateur WHERE LOGIN = '" + textBox1.Text.Trim() + "' and PASSWORD = '" + textBox2.Text.Trim() + "'";
                MySqlDataAdapter sda = new MySqlDataAdapter(queryUser, connexion);
                DataTable dtbl = new DataTable();
                sda.Fill(dtbl);
                if (dtbl.Rows.Count == 1)
                {
                    MessageBox.Show("Connecté");
                }
                else
                {
                    MessageBox.Show("Le nom ou le mot de passe est incorrect");
                }
            }
            catch (MySqlException esql)
            {
                MessageBox.Show("Non connecté : " + esql.ToString());
            }
        }
    }
}
