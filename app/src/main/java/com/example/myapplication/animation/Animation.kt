package com.example.myapplication.animation

import android.os.Bundle
import android.transition.*
import android.view.View
import android.view.animation.LinearInterpolator
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_animation.*

class Animation : AppCompatActivity() {

    private lateinit var scene1: Scene
    private lateinit var scene2: Scene
    private lateinit var currentScene: Scene
    private lateinit var transitionSet: TransitionSet
    private lateinit var transition: Transition

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation)

        // Step 1: Create a Scene object for both the starting and ending layout

//        Both scene1 initialization are same
//        scene1 = Scene.getSceneForLayout(R.id.sceneRootFrameLayout, R.layout.scene1, this)
        scene1 = Scene.getSceneForLayout(sceneRootFrameLayout, R.layout.scene1, this)
        scene2 = Scene.getSceneForLayout(sceneRootFrameLayout, R.layout.scene2, this)

        //It is use to show the scene that is user going to see first before any animation
        scene1.enter()
        currentScene = scene1

        // Step 2: Create a Transition object to define what type of animation you want

        //It is use for usr defined animation.
//        transition = TransitionInflater.from(this).inflateTransition(R.transition.example2)

        //Transition without using transition folder
        val cbTransition = ChangeBounds()
        cbTransition.duration = 500
        cbTransition.interpolator = LinearInterpolator()

        val fadeInTransition = Fade(Fade.IN)
        fadeInTransition.duration = 250
        fadeInTransition.startDelay = 400
        fadeInTransition.addTarget(R.id.txvTitle)

        val fadeOutTransition = Fade(Fade.OUT)
        fadeOutTransition.duration = 50
        fadeOutTransition.addTarget(R.id.txvTitle)

        //addTransition should be kept in mind if order is sequential
        transitionSet = TransitionSet()
        transitionSet.ordering = TransitionSet.ORDERING_TOGETHER
        transitionSet.addTransition(cbTransition)
        transitionSet.addTransition(fadeInTransition)
        transitionSet.addTransition(fadeOutTransition)

    }

    fun onClick(view: View) {
        // Step 3: Call TransitionManager.go() to run animation
//        currentScene = if (currentScene == scene1) {
//            TransitionManager.go(scene2, transition)
//            scene2
//        } else {
//            TransitionManager.go(scene1, transition)
//            scene1
//        }

        //For Transition without Transition folder
        currentScene = if (currentScene == scene1) {
            TransitionManager.go(scene2, transitionSet)
            scene2
        } else {
            TransitionManager.go(scene1, transitionSet)
            scene1
        }
    }
}