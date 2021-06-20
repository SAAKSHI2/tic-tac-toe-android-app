package com.example.Tic_tac_toe;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    TextView textView7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);
        textView7 = findViewById(R.id.textView7);
    }
    public void play(View view)
    {
        setNull();
        final int[] i = {1};
        final int[] count = {0};
        char[] ch ={'O','X'};
        final char[] c = new char[1];
        textView7.setText(ch[i[0]]+" Player turns");
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (b1.getText() == "") {
                    if(count[0]==9)
                        count[0]=0;
                    if (i[0] == 1) {
                        c[0] =ch[i[0]];
                        b1.setText("X");
                        i[0] = 0;
                    } else {
                        b1.setText("O");
                        c[0] =ch[i[0]];
                        i[0] = 1;

                    }
                    ++count[0];
                    count[0]= calc(c[0], count[0]);
                    textView7.setText(ch[i[0]]+" Player turns");
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b2.getText() == "") {
                    if(count[0]==9)
                        count[0]=0;
                    if (i[0] == 1) {
                        c[0] =ch[i[0]];
                        b2.setText("X");
                        i[0] = 0;
                    } else {
                        b2.setText("O");
                        c[0] =ch[i[0]];
                        i[0] = 1;
                    }
                    ++count[0];
                    count[0]=calc(c[0], count[0]);
                    textView7.setText(ch[i[0]]+" Player turns");
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b3.getText() == "") {
                    if(count[0]==9)
                        count[0]=0;
                    if (i[0] == 1) {
                        b3.setText("X");
                        c[0] =ch[i[0]];
                        i[0] = 0;
                    } else {
                        b3.setText("O");
                        c[0] =ch[i[0]];
                        i[0] = 1;
                    }
                    ++count[0];
                    count[0]=  calc(c[0], count[0]);
                    textView7.setText(ch[i[0]]+" Player turns");
                }
            }

        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b4.getText() == "") {
                    if(count[0]==9)
                        count[0]=0;
                    if (i[0] == 1) {
                        b4.setText("X");
                        c[0] =ch[i[0]];
                        i[0] = 0;
                    } else {
                        b4.setText("O");
                        c[0] =ch[i[0]];
                        i[0] = 1;
                    }
                    ++count[0];
                    count[0]=  calc(c[0], count[0]);
                    textView7.setText(ch[i[0]]+" Player turns");
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b5.getText() == "") {
                    if(count[0]==9)
                        count[0]=0;
                    if (i[0] == 1) {
                        b5.setText("X");
                        c[0] =ch[i[0]];
                        i[0] = 0;
                    } else {
                        b5.setText("O");
                        c[0] =ch[i[0]];
                        i[0] = 1;
                    }
                    ++count[0];
                    count[0]=calc(c[0], count[0]);
                    textView7.setText(ch[i[0]]+" Player turns");
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b6.getText() == "") {
                    if(count[0]==9)
                        count[0]=0;
                    if (i[0] == 1) {
                        b6.setText("X");
                        c[0] =ch[i[0]];
                        i[0] = 0;
                    } else {
                        b6.setText("O");
                        c[0] =ch[i[0]];
                        i[0] = 1;
                    }
                    ++count[0];
                    count[0]=calc(c[0], count[0]);
                    textView7.setText(ch[i[0]]+" Player turns");
                }
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b7.getText() == "") {
                    if(count[0]==9)
                        count[0]=0;
                    if (i[0] == 1) {
                        b7.setText("X");
                        c[0] =ch[i[0]];
                        i[0] = 0;
                    } else {
                        b7.setText("O");
                        c[0] =ch[i[0]];
                        i[0] = 1;
                    }
                    ++count[0];
                    count[0]= calc(c[0], count[0]);
                    textView7.setText(ch[i[0]]+" Player turns");
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b8.getText() == "") {
                    if(count[0]==9)
                        count[0]=0;
                    if (i[0] == 1) {
                        b8.setText("X");
                        c[0] =ch[i[0]];
                        i[0] = 0;
                    } else {
                        b8.setText("O");
                        c[0] =ch[i[0]];
                        i[0] = 1;
                    }
                    ++count[0];
                    count[0]=calc(c[0], count[0]);
                    textView7.setText(ch[i[0]]+" Player turns");
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b9.getText() == "") {
                    if(count[0]==9)
                        count[0]=0;
                    if (i[0] == 1) {
                        b9.setText("X");
                        c[0] =ch[i[0]];
                        i[0] = 0;
                    } else {
                        b9.setText("O");
                        c[0] =ch[i[0]];
                        i[0] = 1;
                    }
                    ++count[0];
                    count[0]= calc(c[0], count[0]);
                    textView7.setText(ch[i[0]]+" Player turns");
                }
            }
        });
    }

    private int calc(char ch, int count)
    {
        if((b1.getText()=="O" && b2.getText()=="O" && b3.getText()=="O") || (b1.getText()=="X" && b2.getText()=="X" && b3.getText()=="X"))
        {
            alertDialog(ch,count);
            return 0;
        }
        else if((b4.getText()=="O" && b5.getText()=="O" && b6.getText()=="O") || (b4.getText()=="X" && b5.getText()=="X" && b6.getText()=="X"))
         {
             alertDialog(ch,count);
             return 0;
         }
        else if((b7.getText()=="O" && b8.getText()=="O" && b9.getText()=="O") || (b7.getText()=="X" && b8.getText()=="X" && b9.getText()=="X"))
        {
            alertDialog(ch,count);
            return 0;
        }
        else if((b1.getText()=="O" && b4.getText()=="O" && b7.getText()=="O") || (b1.getText()=="X" && b4.getText()=="X" && b7.getText()=="X"))
        {
            alertDialog(ch,count);
            return 0;
        }
        else if((b2.getText()=="O" && b5.getText()=="O" && b8.getText()=="O") || (b2.getText()=="X" && b5.getText()=="X" && b8.getText()=="X"))
        {
            alertDialog(ch,count);
            return 0;
        }
        else if((b3.getText()=="O" && b6.getText()=="O" && b9.getText()=="O") || (b3.getText()=="X" && b6.getText()=="X" && b9.getText()=="X"))
        {
            alertDialog(ch,count);
            return 0;
        }
        else if((b1.getText()=="O" && b5.getText()=="O" && b9.getText()=="O") || (b1.getText()=="X" && b5.getText()=="X" && b9.getText()=="X"))
        {
            alertDialog(ch,count);
            return 0;
        }
        else if((b3.getText()=="O" && b5.getText()=="O" && b7.getText()=="O") || (b3.getText()=="X" && b5.getText()=="X" && b7.getText()=="X"))
        {
            alertDialog(ch,count);
            return 0;
        }
        else if(count==9)
            alertDialog(ch,count+1);

        return count;
    }
    void setNull()
    {
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
    }
    private void alertDialog(char ch,int count) {
        AlertDialog.Builder dialog=new AlertDialog.Builder(this);
        if(count==10) {
            dialog.setTitle("It's a tie !!");
        }
        else
        {
            dialog.setTitle(ch + " Player won !!");
        }
        dialog.setMessage("Do you want to play again");
        dialog.setPositiveButton("Yes",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,
                                        int which) {
                       setNull();
                    }
                });
        dialog.setNegativeButton("No",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finishAffinity();
                System.exit(0);
            }
        });

        AlertDialog alertDialog=dialog.create();
        alertDialog.show();
    }

}