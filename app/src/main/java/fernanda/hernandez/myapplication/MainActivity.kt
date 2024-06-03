package fernanda.hernandez.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val nombre = findViewById<EditText>(R.id.txtnombre)
        val edad = findViewById<EditText>(R.id.txtedad)
        val correo = findViewById<EditText>(R.id.txtcorreo)
        val contra = findViewById<EditText>(R.id.txtcontra)
        val dui = findViewById<EditText>(R.id.txtdui)
        val agregar = findViewById<Button>(R.id.btnagregar)

        //agregar evento al boton
        agregar.setOnClickListener {
            if (nombre.text.isEmpty() || edad.text.isEmpty() || correo.text.isEmpty() || contra.text.isEmpty() || dui.text.isEmpty()) {
                Toast.makeText(this, "llene todos los campos", Toast.LENGTH_LONG).show()
//validar solo numeros
            } else if (edad.text.matches("[0-9]+".toRegex())) {
                Toast.makeText(this, "campos agregados correctamente", Toast.LENGTH_LONG).show()

            } else {
                Toast.makeText(this, "Verifique los campos", Toast.LENGTH_LONG).show()

            }


        }
//validar correo
        if (correo.text.matches("[a-zA-Z0-9._-]+@[a-z]\\\\.+[a-z]+]".toRegex())) {
            Toast.makeText(this, "campo agregado", Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(this, "ingrese campos validos", Toast.LENGTH_LONG).show()

        }

        //validar contraseña para que tenga 7 digitos
        if (correo.text.length <= 6) {
            Toast.makeText(this, "debe tener mas de 7 dijitos", Toast.LENGTH_LONG).show()
        }
        if (dui.text.matches("[0-9]+-[0-9]".toRegex())
            && dui.text.length <= 10
        ) {

        } else {

        }
        if (nombre.text.matches("[a-zA-Z]=".toRegex())){


          }
    }

}










