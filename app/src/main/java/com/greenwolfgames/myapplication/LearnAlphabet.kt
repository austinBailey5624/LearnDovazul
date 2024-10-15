package com.greenwolfgames.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import java.util.stream.Collectors

class LearnAlphabet : ComponentActivity()
{

    var alphabetCharacters: List<AlphabetCharacter> = AlphabetCharacter.getAlphabet()
    var numCorrect = 0;
    var numIncorrect = 0;
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.learn_alphabet)
        alphabetCharacters.shuffled()

    }

    fun setQuizLetter(quizletter: AlphabetCharacter)
    {
        val letter: TextView = findViewById(R.id.textView2)
        letter.setText(quizletter.characters)

        var wrongAnswers = alphabetCharacters;
        //remove the correct answer from the wrong answers
        wrongAnswers = wrongAnswers.stream().filter { letter.equals(quizletter) }.collect(Collectors.toList())
        wrongAnswers.shuffled()
    }
}