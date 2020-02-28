using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace POCCSharp
{
    class User
    {
        private string fname; //Prénom
        private string lname; //Nom de famille
        private string pw; //Mot de passe

        public User(string fn, string ln, string pw)
        {
            fname = fn;
            lname = pw;
            this.pw = pw;
        }

        private void setFirstName(string fn)
        {
            fname = fn;
        }
        private string getFirstName()
        {
            return fname;
        }

        private void setLastName(string ln)
        {
            lname = ln;
        }
        private string getLastName()
        {
            return lname;
        }

        private void setPassword(string pw)
        {
            this.pw = pw;
        }
    }
}
