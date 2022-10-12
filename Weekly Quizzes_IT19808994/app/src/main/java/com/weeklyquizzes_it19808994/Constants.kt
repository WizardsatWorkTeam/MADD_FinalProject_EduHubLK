package com.weeklyquizzes_it19808994

object Constants {

    // START
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    // END
    
    fun getQue(): ArrayList<QuizQuestion> {

        val questionsList = ArrayList<QuizQuestion>()

        // 1 st Question
        val q1 = QuizQuestion(
            1, "Which was the initial object oriented programming language created?",
            "Kotlin", " SmallTalk",
            "Java", "C++",
            2
        )

        questionsList.add(q1)

        // 2 nd Question
        val q2 = QuizQuestion(
            2, "Which is the correct syntax of inheritance",
            "class base_classname :access derived_classname{ /*define class body*/ };",
            "class derived_classname : access base_classname{ /*define class body*/ };",
            "class derived_classname : base_classname{ /*define class body*/ };",
            "class base_classname : derived_classname{ /*define class body*/ };",
            2
        )

        questionsList.add(q2)

        // 3 rd Question
        val q3 = QuizQuestion(
            3, "Which among the following doesn’t come under OOP concept?",
            "Data hiding", "Message passing",
            "Platform independent", "Data binding",
            3
        )

        questionsList.add(q3)

        // 4 th Question
        val q4 = QuizQuestion(
            4, "Which of the following is not true about polymorphism?",
            "Helps in redefining the same functionality",
            "Increases overhead of function definition always",
            "It is feature of OOP", " Ease in readability of program",
            2
        )

        questionsList.add(q4)

        // 5 th Question
        val q5 = QuizQuestion(
            5, "The copy constructors can be used to ________",
            "Copy an object so that it can be passed to another primitive type variable",
            "Copy an object for type casting",
            "Copy an object so that it can be passed to a function",
            "Copy an object so that it can be passed to a class",
            3
        )

        questionsList.add(q5)

        // 6 th Question
        val q6 = QuizQuestion(
            6, "Which access specifier is usually used for data members of a class??",
            "Protected", "Private",
            "Public", "none of these",
            2
        )

        questionsList.add(q6)

        // 7 th Question
        val q7 = QuizQuestion(
            7, "Which keyword should be used to declare static variables?",
            "const", "common",
            "static", "stat",
            3
        )

        questionsList.add(q7)

        // 8 th Question
        val q8 = QuizQuestion(
            8, "Which of the following language supports polymorphism but not the classes?",
            "C++ programming language",
            "Java programming language",
            "Ada programming language",
            "C# programming language",
            3
        )

        questionsList.add(q8)

        // 9 th Question
        val q9 = QuizQuestion(
            9, "Define the programming language, which does not support all four types of inheritance",
            "Smalltalk", "Java",
            "Kotlin", "C++",
            2
        )

        questionsList.add(q9)

        // 10 th Question
        val q10 = QuizQuestion(
            10, "Which feature in OOP is used to allocate additional functions to a predefined operator in any language?",
            "Function Overloading", "Function Overriding",
            "Operator Overloading", "Operator Overriding",
            3
        )

        questionsList.add(q10)

        return questionsList
    }
}