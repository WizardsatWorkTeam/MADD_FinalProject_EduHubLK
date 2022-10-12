package com.weeklyquizzes_it19808994

data class QuizQuestion(
    val id: Int,
    val question: String,
    val option1: String,
    val option2: String,
    val option3: String,
    val option4: String,
    val correctAnswer: Int
)