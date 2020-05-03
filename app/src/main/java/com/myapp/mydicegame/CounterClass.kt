package com.my.dicegame

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

//import android.R;
class CounterClass : AppCompatActivity()

{


    private val randomNum = Random()





    private var ValOne: TextView? = null
    private var ValTwo: TextView? = null
    private var ValThree: TextView? = null
    private var ValFour: TextView? = null
    private var ValFive: TextView? = null
    private var ValSix: TextView? = null




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dice_counter)



        ValOne=findViewById<View>(R.id.valone) as TextView
        ValTwo=findViewById<View>(R.id.valtwo) as TextView
        ValThree=findViewById<View>(R.id.valthree) as TextView
        ValFour=findViewById<View>(R.id.valfour) as TextView
        ValFive=findViewById<View>(R.id.valfive) as TextView
        ValSix=findViewById<View>(R.id.valsix) as TextView



    }



    fun randdice(view: View)
    {

        val diceImage = findViewById<View>(R.id.image_view_dice) as ImageView

        val randomDiceDigit = randomNum.nextInt(6) + 1

        if (randomDiceDigit==1)
        {
            diceImage.setImageResource(R.drawable.faceone)
            ValOne!!.setText( (ValOne!!.text.toString().toInt() + 1).toString())
        }
        if (randomDiceDigit==2)
        {
            diceImage.setImageResource(R.drawable.facetwo)
            ValTwo!!.setText((ValTwo!!.getText().toString().toInt() + 1).toString())
        }

        if (randomDiceDigit==3)
        {
            diceImage.setImageResource(R.drawable.facethree)
            ValThree!!.setText((ValThree!!.getText().toString().toInt() + 1).toString())
        }

        if (randomDiceDigit==4)
        {
            diceImage.setImageResource(R.drawable.facefour)
            ValFour!!.setText((ValFour!!.getText().toString().toInt() + 1).toString())
        }

        if (randomDiceDigit==5)
        {


            diceImage.setImageResource(R.drawable.facefive)
            ValFive!!.setText((ValFive!!.getText().toString().toInt() + 1).toString())

        }
        if (randomDiceDigit==6)
        {

            diceImage.setImageResource(R.drawable.facesix)
            ValSix!!.setText( (ValSix!!.getText().toString().toInt() + 1).toString())
        }


    }

    fun rest(view: View)
    {

        ValOne!!.setText( "0")
        ValTwo!!.setText( "0")
        ValThree!!.setText( "0")
        ValFour!!.setText( "0")
        ValFive!!.setText( "0")
        ValSix!!.setText( "0")

    }

}