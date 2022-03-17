package com.codennamdi.mybucketlist;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class ThingsILove extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things_ilove);
        setUpList();
    }

    private void setUpList() {

        RecyclerView thingsILoveItems = findViewById(R.id.recycler_view_items_things_i_love);

        Projects[] thingsILoveArrays = {
                new Projects("Jesus Christ", "My lord and personal saviour 'Jesus Christ', who died on the cross for us.", R.drawable.christ_img, 5),
                new Projects("Problem Solve", "Problem solving is the act of defining a problem; determining the cause of the problem; identifying, prioritizing, and selecting alternatives for a solution; and implementing a solution. The problem-solving process. Problem solving resources.", R.drawable.problem_solve_img, 4.5f),
                new Projects("Computer Science", "Computer science is the study of computation, automation, and information. Computer science spans theoretical disciplines to practical disciplines. Computer science is generally considered an area of academic research and distinct from computer programming", R.drawable.computer_science_img, 5),
                new Projects("Write Code", "“Writing code,” “coding,” and “programming” are basically interchangeable terms. Broadly speaking, knowing how to write code is the process of creating instructions that tell a computer what to do, and how to do it. Codes are written in various languages, such as javascript, C#, Python, and much more.", R.drawable.write_code_img, 5),
                new Projects("Video Games", "A video game or computer game is an electronic game that involves interaction with a user interface or input device – such as a joystick, controller, keyboard, or motion sensing device – to generate visual feedback.", R.drawable.video_game_img, 4.7f),
                new Projects("Android Development", "Android software development is the process by which applications are created for devices running the Android operating system. Google states that Android apps can be written using Kotlin, Java, and C++ languages using the Android software development kit, while using other languages is also possible.", R.drawable.android_dev_img, 5),
                new Projects("Game Development", "Game Development is the art of creating games and describes the design, development and release of a game. It may involve concept generation, design, build, test and release. While you create a game, it is important to think about the game mechanics, rewards, player engagement and level design.", R.drawable.game_dev_img, 4.5f)
        };

        RecyclerViewProjectsAdapter adapter = new RecyclerViewProjectsAdapter(thingsILoveArrays);
        thingsILoveItems.setAdapter(adapter);
    }
}