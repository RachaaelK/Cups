package sg.com.kaplan.cups;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button play;

    ImageView left,middle,right;

    Button new_game;

    List<Integer> cards;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play= (Button)findViewById(R.id.button_play);
        final MediaPlayer mp = MediaPlayer.create(MainActivity.this,R.raw.m1);
        play.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (mp.isPlaying()){
                    mp.pause();
                    play.setBackgroundResource(R.drawable.play);

                }else {
                    mp.start();
                    play.setBackgroundResource(R.drawable.pause);
                }
            }
                                });


        left = (ImageView) findViewById(R.id.left);
        middle = (ImageView) findViewById(R.id.middle);
        right = (ImageView) findViewById(R.id.right);

        new_game = (Button) findViewById(R.id.new_game);

        cards = new ArrayList<>();
        cards.add(107);//K of spades
        cards.add(207);//Joker
        cards.add(407);//K of spades

        //shuffle the cards
        Collections.shuffle(cards);

        new_game.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //shuffle the cards
                Collections.shuffle(cards);

                left.setImageResource(R.drawable.cardback);
                middle.setImageResource(R.drawable.cardback);
                right.setImageResource(R.drawable.cardback);

                Animation anim_left= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.left);
                Animation anim_middle= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.middle);
                Animation anim_right= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.right);

                left.startAnimation(anim_left);
                middle.startAnimation(anim_middle);
                right.startAnimation(anim_right);
            }
        });

        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            //assign images
                if(cards.get(0)== 107){
                    left.setImageResource(R.drawable.card1);
                    Toast.makeText(MainActivity.this,"Guessed!",Toast.LENGTH_SHORT).show();
                } else if(cards.get(0)==207){
                    left.setImageResource(R.drawable.joker);
                } else if(cards.get(0)==407){
                    left.setImageResource(R.drawable.card2);
                }

                if(cards.get(1)== 107){
                    middle.setImageResource(R.drawable.card1);
                } else if(cards.get(1)==207){
                    middle.setImageResource(R.drawable.joker);
                } else if(cards.get(1)==407){
                    middle.setImageResource(R.drawable.card2);
                }

                if(cards.get(2)== 107){
                    right.setImageResource(R.drawable.card1);
                } else if(cards.get(2)==207){
                    right.setImageResource(R.drawable.joker);
                } else if(cards.get(2)==407){
                    right.setImageResource(R.drawable.card2);
                }
            }
        });

        middle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //assign images
                if(cards.get(1)== 107){
                    middle.setImageResource(R.drawable.card1);
                    Toast.makeText(MainActivity.this,"Guessed!",Toast.LENGTH_SHORT).show();
                } else if(cards.get(1)==207){
                    middle.setImageResource(R.drawable.joker);
                } else if(cards.get(1)==407){
                    middle.setImageResource(R.drawable.card2);
                }

                if(cards.get(0)== 107){
                    left.setImageResource(R.drawable.card1);
                } else if(cards.get(0)==207){
                    left.setImageResource(R.drawable.joker);
                } else if(cards.get(0)==407){
                    left.setImageResource(R.drawable.card2);
                }

                if(cards.get(2)== 107){
                    right.setImageResource(R.drawable.card1);
                } else if(cards.get(2)==207){
                    right.setImageResource(R.drawable.joker);
                } else if(cards.get(2)==407){
                    right.setImageResource(R.drawable.card2);
                }
            }
        });

        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //assign images
                if(cards.get(2)== 107){
                    right.setImageResource(R.drawable.card1);
                    Toast.makeText(MainActivity.this,"Guessed!",Toast.LENGTH_SHORT).show();
                } else if(cards.get(2)==207){
                    right.setImageResource(R.drawable.joker);
                } else if(cards.get(2)==407){
                    right.setImageResource(R.drawable.card2);
                }

                if(cards.get(0)== 107){
                    left.setImageResource(R.drawable.card1);
                } else if(cards.get(0)==207){
                    left.setImageResource(R.drawable.joker);
                } else if(cards.get(0)==407){
                    left.setImageResource(R.drawable.card2);
                }

                if(cards.get(1)== 107){
                    middle.setImageResource(R.drawable.card1);
                } else if(cards.get(1)==207){
                    middle.setImageResource(R.drawable.joker);
                } else if(cards.get(1)==407){
                    middle.setImageResource(R.drawable.card2);
                }
            }
        });
    }
}
