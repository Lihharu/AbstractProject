package learn.idn.abstractproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class LoginActivity : AppCompatActivity() {

    private lateinit var dataEmail: Array<String>
    private lateinit var dataPassword: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)

        val edtMail : EditText = findViewById(R.id.edt_email)
        val edtPassword : EditText = findViewById(R.id.edt_password)
        val btnLogin : Button = findViewById(R.id.btn_login)
        val btnRegister : Button = findViewById(R.id.btn_register)
        val progressBar : ProgressBar = findViewById(R.id.progress_bar)

        dataEmail = arrayOf("Ameer", "Dhawy", "Al Falih")
        dataPassword = arrayOf("1234", "5678", "4321")

        btnLogin.setOnClickListener{
            signIn(edtMail.text.toString(), edtPassword.text.toString())
        }

    }

    fun signIn(email: String, password: String){
        for (i in dataEmail.indices){
            val takeDataEmail = dataEmail.get(1)
            val takeDataPass = dataPassword.get(1)
            if (takeDataEmail == email || takeDataPass == password){
                Toast.makeText(this, "LogedIn", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "Akun Salah", Toast.LENGTH_SHORT).show()
            }
        }
    }
}