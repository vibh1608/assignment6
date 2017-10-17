package com.example.rohitgiri.assignment41;

import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by rohit giri on 14-09-2017.
 */

public class MainActivityTest
{
    @Rule
    public ActivityTestRule<MainActivity> main=new ActivityTestRule<MainActivity>(MainActivity.class);

    public String email="vibhor";
    public String password="12345678";

    @Test
    public void testUserInterface()
    {
        Espresso.onView(withId(R.id.e1)).perform(typeText(email));
        Espresso.closeSoftKeyboard();
        Espresso.onView(withId(R.id.e2)).perform(typeText(password));
        Espresso.closeSoftKeyboard();
        Espresso.onView(withId(R.id.t2)).perform(click());
        Espresso.onView(withId(R.id.t3)).check(matches(withText(email+" "+password)));


    }

    @Before
    public void setUp() throws Exception
    {

    }

    @After
    public void tearDown() throws Exception
    {

    }
}
