package com.example.chenzhiran.zmgplt;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class LoginActivity extends AppCompatActivity {

    private EditText editText1;
    private EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editText1 = (EditText) findViewById(R.id.user_editText);
        editText2 = (EditText) findViewById(R.id.password_editText);
    }

    public void click(View v)
    {
        String inputusername = editText1.getText().toString();
        String inputpassword = editText2.getText().toString();

        switch(v.getId())
        {
            case R.id.register_button:
                if(hasWords(inputusername, inputpassword) == true) {
                    String senddata = "1;" + inputusername + ";" + inputpassword;
                    new connection().execute(senddata);
                }
                else return;
                break;

            case R.id.login_in_button:
                if(hasWords(inputusername, inputpassword) == true) {
                    String senddata = "0;" + inputusername + ";" + inputpassword;
                    new connection().execute(senddata);
                }
                else return;
                break;

            case R.id.look_in_button:
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
                break;

            case R.id.forget_password_button:

                break;
        }
    }

    private boolean hasWords(String inputpassword, String inputusername)
    {
        if(inputpassword == null || inputpassword.length() == 0)
        {
            Toast.makeText(LoginActivity.this, "please input password",
                    Toast.LENGTH_SHORT).show();
            return false;
        }

        if(inputusername == null || inputpassword.length() == 0)
        {
            Toast.makeText(LoginActivity.this, "please input username",
                    Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

    private class connection extends AsyncTask<String, Void, String>
    {
        @Override
        protected void onPreExecute()
        {
            super.onPreExecute();
        }

        @Override
        protected String doInBackground(String... params)
        {
            String senddata = params[0];
            Log.e("LoginActivity", senddata);
            String receivedata = null;
            try
            {
                Socket socket = new Socket("45.76.194.253", 1080);
                DataOutputStream writer = new DataOutputStream(socket.getOutputStream());
                DataInputStream reader = new DataInputStream(socket.getInputStream());
                writer.writeUTF(senddata);
                Log.e("LoginActivity", "first");
                receivedata = reader.readUTF();
                //writer.close();
                //reader.close();
                socket.close();
            } catch (IOException e)
            {
                e.printStackTrace();
            }

            return receivedata;
        }

        @Override
        protected void onPostExecute(String data)
        {
            super.onPostExecute(data);
            if(data.equals("0") == true)
            {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }

            else
            {
                Toast.makeText(LoginActivity.this, "incorrect input",
                        Toast.LENGTH_SHORT).show();
            }
        }
    }
}
