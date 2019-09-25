package com.example.studenttest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class CourseListActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView listCourse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_list);
        listCourse =findViewById(R.id.list_course);


        initData();

    }

    private List<Course> courses = new ArrayList<>();
    private void initData() {
        courses.add(new Course("Android应用程序开发"));
        courses.add(new Course("移动应用程序测试"));
        courses.add(new Course("高等数学"));
        courses.add(new Course("高职英语"));
        courses.add(new Course("Android游戏开发"));
        courses.add(new Course("心理健康"));
        courses.add(new Course("体育"));
        CourseAdapter courseAdapter = new CourseAdapter(courses,CourseListActivity.this);
        listCourse.setAdapter(courseAdapter);
        listCourse.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
       Course course = (Course) adapterView.getItemAtPosition(i);
       Toast.makeText(CourseListActivity.this,course.getName(),Toast.LENGTH_LONG).show();
       Intent intent = new Intent(CourseListActivity.this,TextActivity.class);
       startActivity(intent);
    }
}
