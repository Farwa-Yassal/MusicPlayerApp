package com.example.testapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {
    private MediaPlayer audio1, audio2, audio3, audio4, audio5, audio6, audio7, audio8, audio9, audio10, audio11, audio12, audio13;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Click to play the song and long Click to stop ", Toast.LENGTH_LONG).show();
        // Initialize MediaPlayer objects with audio files from the 'raw' folder
        audio1 = MediaPlayer.create(this, R.raw.amazing_grace);
        audio2 = MediaPlayer.create(this, R.raw.somewhereovertherainbow);
        audio3 = MediaPlayer.create(this, R.raw.jimmie_davis_you_are_my_sunshine);
        audio4 = MediaPlayer.create(this, R.raw.oh_my_darling_clementine);
        audio5 = MediaPlayer.create(this, R.raw.oh_susanna_singing_bell1);
        audio6 = MediaPlayer.create(this, R.raw.yankee_doodle);
        audio7 = MediaPlayer.create(this, R.raw.judy_garland_over_the_rainbow);
        audio8 = MediaPlayer.create(this, R.raw.this_land_is_your_land);
        audio9 = MediaPlayer.create(this, R.raw.gene_kelly_singin_in_the_rain);
        audio10 = MediaPlayer.create(this, R.raw.moon_river);
        audio11 = MediaPlayer.create(this, R.raw.cristantoro_rastafara_beatles_i_want_to_hold_your_hand_mp3);
        audio12 = MediaPlayer.create(this, R.raw.ben_e_king_stand_by_me);
        audio13 = MediaPlayer.create(this, R.raw.what_a_wonderful_world);
        // Find the buttons in the layout and set click listeners on them
        Button button1 = findViewById(R.id.btn1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button1.setBackgroundColor(getResources().getColor(R.color.white));
                button1.setTextColor(getResources().getColor(R.color.blue));
                audio1.start();

            }
        });
        button1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                button1.setBackgroundColor(getResources().getColor(R.color.blue));
                button1.setTextColor(getResources().getColor(R.color.white));
                audio1.stop();
                return true;
            }
        });
        Button button2 = findViewById(R.id.btn2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                audio2.start();
                button2.setBackgroundColor(getResources().getColor(R.color.white));
                button2.setTextColor(getResources().getColor(R.color.blue));
            }
        });

        button2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                audio2.stop();
                button2.setBackgroundColor(getResources().getColor(R.color.blue));
                button2.setTextColor(getResources().getColor(R.color.white));
                return true;
            }
        });
        Button button3 = findViewById(R.id.btn3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button3.setBackgroundColor(getResources().getColor(R.color.white));
                button3.setTextColor(getResources().getColor(R.color.blue));
                audio3.start();

            }
        });
        button3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                button3.setBackgroundColor(getResources().getColor(R.color.blue));
                button3.setTextColor(getResources().getColor(R.color.white));
                audio3.stop();
                return true;
            }
        });
        Button button4 = findViewById(R.id.btn4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button4.setBackgroundColor(getResources().getColor(R.color.white));
                button4.setTextColor(getResources().getColor(R.color.blue));
                audio4.start();

            }
        });
        button4.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                button4.setBackgroundColor(getResources().getColor(R.color.blue));
                button4.setTextColor(getResources().getColor(R.color.white));
                audio4.stop();
                return true;
            }
        });
        Button button5 = findViewById(R.id.btn5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button5.setBackgroundColor(getResources().getColor(R.color.white));
                button5.setTextColor(getResources().getColor(R.color.blue));
                audio5.start();

            }
        });
        button5.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                button5.setBackgroundColor(getResources().getColor(R.color.blue));
                button5.setTextColor(getResources().getColor(R.color.white));
                audio5.stop();
                return true;
            }
        });
        Button button6 = findViewById(R.id.btn6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button6.setBackgroundColor(getResources().getColor(R.color.white));
                button6.setTextColor(getResources().getColor(R.color.blue));
                audio6.start();

            }
        });
        button6.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                button6.setBackgroundColor(getResources().getColor(R.color.blue));
                button6.setTextColor(getResources().getColor(R.color.white));
                audio6.stop();
                return true;
            }
        });
        Button button7 = findViewById(R.id.btn7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button7.setBackgroundColor(getResources().getColor(R.color.white));
                button7.setTextColor(getResources().getColor(R.color.blue));
                audio7.start();

            }
        });
        button7.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                button7.setBackgroundColor(getResources().getColor(R.color.blue));
                button7.setTextColor(getResources().getColor(R.color.white));
                audio7.stop();
                return true;
            }
        });
        Button button8 = findViewById(R.id.btn8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button8.setBackgroundColor(getResources().getColor(R.color.white));
                button8.setTextColor(getResources().getColor(R.color.blue));
                audio8.start();

            }
        });
        button8.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                button8.setBackgroundColor(getResources().getColor(R.color.blue));
                button8.setTextColor(getResources().getColor(R.color.white));
                audio8.stop();
                return true;
            }
        });
        Button button9 = findViewById(R.id.btn9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button9.setBackgroundColor(getResources().getColor(R.color.white));
                button9.setTextColor(getResources().getColor(R.color.blue));
                audio9.start();

            }
        });
        button9.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                button9.setBackgroundColor(getResources().getColor(R.color.blue));
                button9.setTextColor(getResources().getColor(R.color.white));
                audio9.stop();
                return true;
            }
        });
        Button button10 = findViewById(R.id.btn10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button10.setBackgroundColor(getResources().getColor(R.color.white));
                button10.setTextColor(getResources().getColor(R.color.blue));
                audio10.start();

            }
        });
        button10.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                button10.setBackgroundColor(getResources().getColor(R.color.blue));
                button10.setTextColor(getResources().getColor(R.color.white));
                audio10.stop();
                return true;
            }
        });
        Button button11 = findViewById(R.id.btn11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button11.setBackgroundColor(getResources().getColor(R.color.white));
                button11.setTextColor(getResources().getColor(R.color.blue));
                audio11.start();

            }
        });
        button11.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                button11.setBackgroundColor(getResources().getColor(R.color.blue));
                button11.setTextColor(getResources().getColor(R.color.white));
                audio11.stop();
                return true;
            }
        });
        Button button12 = findViewById(R.id.btn12);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button12.setBackgroundColor(getResources().getColor(R.color.white));
                button12.setTextColor(getResources().getColor(R.color.blue));
                audio12.start();

            }
        });
        button12.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                button12.setBackgroundColor(getResources().getColor(R.color.blue));
                button12.setTextColor(getResources().getColor(R.color.white));
                audio12.stop();
                return true;
            }
        });
        Button button13 = findViewById(R.id.btn13);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button13.setBackgroundColor(getResources().getColor(R.color.white));
                button13.setTextColor(getResources().getColor(R.color.blue));
                audio13.start();

            }
        });
        button13.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                button13.setBackgroundColor(getResources().getColor(R.color.blue));
                button13.setTextColor(getResources().getColor(R.color.white));
                audio13.stop();
                return true;
            }
        });

    }
//    @Override
//    public void onClick(View v) {
//
//        switch (v.getId()) {
//            case R.id.btn1:
//                // If the first button is clicked, play audio1
//                audio1.start();
//                Toast.makeText(this, "Song playing", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.btn2:
//                // If the second button is clicked, play audio2
//                audio2.start();
//                Toast.makeText(this, "Song playing", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.btn3:
//                // If the second button is clicked, play audio2
//                audio3.start();
//                Toast.makeText(this, "Song playing", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.btn4:
//                // If the second button is clicked, play audio2
//                audio4.start();
//                Toast.makeText(this, "Song playing", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.btn5:
//                // If the second button is clicked, play audio2
//                audio5.start();
//                Toast.makeText(this, "Song playing", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.btn6:
//                // If the second button is clicked, play audio2
//                audio6.start();
//                Toast.makeText(this, "Song playing", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.btn7:
//                // If the second button is clicked, play audio2
//                audio7.start();
//                Toast.makeText(this, "Song playing", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.btn8:
//                // If the second button is clicked, play audio2
//                audio8.start();
//                Toast.makeText(this, "Song playing", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.btn9:
//                // If the second button is clicked, play audio2
//                audio9.start();
//                Toast.makeText(this, "Song playing", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.btn10:
//                // If the second button is clicked, play audio2
//                audio10.start();
//                Toast.makeText(this, "Song playing", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.btn11:
//                // If the second button is clicked, play audio2
//                audio11.start();
//                Toast.makeText(this, "Song playing", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.btn12:
//                // If the second button is clicked, play audio2
//                audio12.start();
//                Toast.makeText(this, "Song playing", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.btn13:
//                // If the second button is clicked, play audio2
//                audio13.start();
//                Toast.makeText(this, "Song playing", Toast.LENGTH_SHORT).show();
//                break;
//            default:
//                break;
//        }
//    }
//    @Override
//    public boolean onLongClick(View v) {
//        switch (v.getId()) {
//            case R.id.btn1:
//                // If the first button is long-clicked, stop audio
//                if (audio1.isPlaying())
//                {
//                    audio1.pause();
//                    audio1.seekTo(0);// Reset audio to beginning
//                    Toast.makeText(this, "Song stopped", Toast.LENGTH_SHORT).show();
//                }
//                break;
//            case R.id.btn2:
//                // If the second button is long-clicked, stop audio1
//                if (audio2.isPlaying())
//                {
//                    audio2.pause();
//                    audio2.seekTo(0);  // Reset audio to beginning
//                    Toast.makeText(this, "Song stopped", Toast.LENGTH_SHORT).show();
//                }
//
//            case R.id.btn3:
//                // If the second button is long-clicked, stop audio1
//                if (audio3.isPlaying()) {
//                    audio3.pause();
//                    audio3.seekTo(0);  // Reset audio to beginning
//                    Toast.makeText(this, "Song stopped", Toast.LENGTH_SHORT).show();
//                }
//                break;
//            case R.id.btn4:
//                // If the second button is long-clicked, stop audio1
//                if (audio4.isPlaying()) {
//                    audio4.pause();
//                    audio4.seekTo(0);  // Reset audio to beginning
//                    Toast.makeText(this, "Song stopped", Toast.LENGTH_SHORT).show();
//                }
//                break;
//            case R.id.btn5:
//                // If the second button is long-clicked, stop audio1
//                if (audio5.isPlaying()) {
//                    audio5.pause();
//                    audio5.seekTo(0);  // Reset audio to beginning
//                    Toast.makeText(this, "Song stopped", Toast.LENGTH_SHORT).show();
//                }
//                break;
//            case R.id.btn6:
//                // If the second button is long-clicked, stop audio1
//                if (audio6.isPlaying()) {
//                    audio6.pause();
//                    audio6.seekTo(0);  // Reset audio to beginning
//                    Toast.makeText(this, "Song stopped", Toast.LENGTH_SHORT).show();
//                }
//                break;
//            case R.id.btn7:
//                // If the second button is long-clicked, stop audio1
//                if (audio7.isPlaying()) {
//                    audio7.pause();
//                    audio7.seekTo(0);  // Reset audio to beginning
//                    Toast.makeText(this, "Song stopped", Toast.LENGTH_SHORT).show();
//                }
//                break;
//            case R.id.btn8:
//                // If the second button is long-clicked, stop audio1
//                if (audio8.isPlaying()) {
//                    audio8.pause();
//                    audio8.seekTo(0);  // Reset audio to beginning
//                    Toast.makeText(this, "Song stopped", Toast.LENGTH_SHORT).show();
//                }
//                break;
//            case R.id.btn9:
//                // If the second button is long-clicked, stop audio1
//                if (audio9.isPlaying()) {
//                    audio9.pause();
//                    audio9.seekTo(0);  // Reset audio to beginning
//                    Toast.makeText(this, "Song stopped", Toast.LENGTH_SHORT).show();
//                }
//                break;
//            case R.id.btn10:
//                // If the second button is long-clicked, stop audio1
//                if (audio10.isPlaying()) {
//                    audio10.pause();
//                    audio10.seekTo(0);  // Reset audio to beginning
//                    Toast.makeText(this, "Song stopped", Toast.LENGTH_SHORT).show();
//                }
//                break;
//            case R.id.btn11:
//                // If the second button is long-clicked, stop audio1
//                if (audio11.isPlaying()) {
//                    audio11.pause();
//                    audio11.seekTo(0);  // Reset audio to beginning
//                    Toast.makeText(this, "Song stopped", Toast.LENGTH_SHORT).show();
//                }
//                break;
//            case R.id.btn12:
//                // If the second button is long-clicked, stop audio1
//                if (audio12.isPlaying()) {
//                    audio12.pause();
//                    audio12.seekTo(0);  // Reset audio to beginning
//                    Toast.makeText(this, "Song stopped", Toast.LENGTH_SHORT).show();
//                }
//                break;
//            case R.id.btn13:
//                // If the second button is long-clicked, stop audio1
//                if (audio13.isPlaying()) {
//                    audio13.pause();
//                    audio13.seekTo(0);  // Reset audio to beginning
//                    Toast.makeText(this, "Song stopped", Toast.LENGTH_SHORT).show();
//                }
//                break;
//            default:
//                break;
//        }
//        return true;
//    }
//

    @Override
    protected void onStop() {
        super.onStop();
        // Release MediaPlayer resources when the app is stopped
        audio1.release();
        audio2.release();
        audio3.release();
        audio4.release();
        audio5.release();
        audio6.release();
        audio7.release();
        audio8.release();
        audio9.release();
        audio10.release();
        audio11.release();
        audio12.release();
        audio13.release();
    }
}

