package com.hack.music.usound;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class KeyboardActivity extends AppCompatActivity {
    Button one, two, three, four, five, six, seven;
    final MediaPlayer mp = new MediaPlayer();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keyboard);
        one = (Button) this.findViewById(R.id.key1);
        two = (Button) this.findViewById(R.id.key2);
        three = (Button) this.findViewById(R.id.key3);
        four = (Button) this.findViewById(R.id.key4);
        five = (Button) this.findViewById(R.id.key5);
        six = (Button) this.findViewById(R.id.key6);
        seven = (Button) this.findViewById(R.id.key7);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String path = Environment.getExternalStorageDirectory() + "/"+ "Key 1" +".3gp";
                MediaPlayer player = new MediaPlayer();

                try {
                    player.setDataSource(path);
                    player.prepare();
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                } catch (Exception e) {
                    System.out.println("Exception of type : " + e.toString());
                    e.printStackTrace();
                }

                player.start();
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String path = Environment.getExternalStorageDirectory() + "/"+ "Key 2" +".3gp";
                MediaPlayer player = new MediaPlayer();

                try {
                    player.setDataSource(path);
                    player.prepare();
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                } catch (Exception e) {
                    System.out.println("Exception of type : " + e.toString());
                    e.printStackTrace();
                }

                player.start();
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String path = Environment.getExternalStorageDirectory() + "/"+ "Key 3" +".3gp";
                MediaPlayer player = new MediaPlayer();

                try {
                    player.setDataSource(path);
                    player.prepare();
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                } catch (Exception e) {
                    System.out.println("Exception of type : " + e.toString());
                    e.printStackTrace();
                }

                player.start();
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String path = Environment.getExternalStorageDirectory() + "/"+ "Key 4" +".3gp";
                MediaPlayer player = new MediaPlayer();

                try {
                    player.setDataSource(path);
                    player.prepare();
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                } catch (Exception e) {
                    System.out.println("Exception of type : " + e.toString());
                    e.printStackTrace();
                }

                player.start();
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String path = Environment.getExternalStorageDirectory() + "/"+ "Key 5" +".3gp";
                MediaPlayer player = new MediaPlayer();

                try {
                    player.setDataSource(path);
                    player.prepare();
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                } catch (Exception e) {
                    System.out.println("Exception of type : " + e.toString());
                    e.printStackTrace();
                }

                player.start();
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String path = Environment.getExternalStorageDirectory() + "/"+ "Key 6" +".3gp";
                MediaPlayer player = new MediaPlayer();

                try {
                    player.setDataSource(path);
                    player.prepare();
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                } catch (Exception e) {
                    System.out.println("Exception of type : " + e.toString());
                    e.printStackTrace();
                }

                player.start();
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String path = Environment.getExternalStorageDirectory() + "/"+ "Key 7" +".3gp";
                MediaPlayer player = new MediaPlayer();

                try {
                    player.setDataSource(path);
                    player.prepare();
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                } catch (Exception e) {
                    System.out.println("Exception of type : " + e.toString());
                    e.printStackTrace();
                }

                player.start();
            }
        });

    }
}
