package com.example.learnfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout


class InputFragment : Fragment() {


    private lateinit var e:TextInputEditText
    private lateinit var b:Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v= inflater.inflate(R.layout.fragment_input, container, false)

        e=v.findViewById(R.id.inputData)
        b=v.findViewById(R.id.click_listen)

        b.setOnClickListener{
            var d=e.text.toString()

            val secondFragment:DisplayData=DisplayData.newInstance(d)

            val fragmentTransaction=activity?.supportFragmentManager?.beginTransaction()
            fragmentTransaction?.replace(R.id.fragmentContainerView,secondFragment)
            fragmentTransaction?.addToBackStack(null)
            fragmentTransaction?.commit()

        }
        return v

    }


}