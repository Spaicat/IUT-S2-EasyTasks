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
    public partial class FormPrincipal : Form
    {
        public FormPrincipal(string nameUser)
        {
            MySqlConnection connexion = new MySqlConnection("database=mydb; server=localhost; user id=root; pwd=root");
            InitializeComponent();
            label1.Text += " " + nameUser;

            string queryUser = "SELECT * FROM Projet JOIN commercial ON Projet.commercialID = commercial.ID JOIN Utilisateur ON commercial.utilisateurID = Utilisateur.ID WHERE LOGIN = '" + nameUser + "'";
            MySqlDataAdapter sda = new MySqlDataAdapter(queryUser, connexion);
            DataTable dtbl = new DataTable();
            sda.Fill(dtbl);
            for (int i = 0; i < dtbl.Rows.Count; i++)
            {
                string temp = "";
                if (dtbl.Rows[i][4].ToString() != "")
                    temp = dtbl.Rows[i][2].ToString() + "  /  " + dtbl.Rows[i][3].ToString() + "  /  " + dtbl.Rows[i][4].ToString() + "  /  " + dtbl.Rows[i][5].ToString();
                else
                    temp = dtbl.Rows[i][2].ToString() + "  /  " + dtbl.Rows[i][3].ToString() + "  /  N/A  /  " + dtbl.Rows[i][5].ToString();
                listBox1.Items.Add(temp);
            }
        }
    }
}
