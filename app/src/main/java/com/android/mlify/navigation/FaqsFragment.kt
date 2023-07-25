package com.android.mlify.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.mlify.R
import com.android.mlify.adapter.FaqAdapter
import com.android.mlify.databinding.FragmentFaqsBinding


class FaqsFragment : Fragment(R.layout.fragment_faqs) {

    var qusList = ArrayList<String>()
    var ansList = ArrayList<String>()

    lateinit var useradapter: FaqAdapter
    lateinit var recyclerView: RecyclerView

    private var _binding: FragmentFaqsBinding? = null
    private val binding get() = _binding!!


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentFaqsBinding.bind(view)

        qusList.add(0,"Q: What is our Android ML Kit application, and what features does it offer?")
        qusList.add(1,"Q: Can the features in our application be used offline?")
        qusList.add(2,"Q: How does the Translate feature work in our application?")
        qusList.add(3,"Q: What are the uses of the Entity Extraction feature in our application?")
        qusList.add(4,"Q: How accurate is the Entity Extraction feature?")
        qusList.add(5,"Q: How does the Code Scanner feature enhance user experience?")
        qusList.add(6,"Q: What are some practical applications of the Code Scanner in our app?")
        qusList.add(7,"Q: Is the Code Scanner capable of scanning damaged or low-quality codes?")
        qusList.add(8,"Q: What is AutoDraw, and how does it work in our application?")
        qusList.add(9,"Q: Can AutoDraw recognize complex drawings?")
        qusList.add(10,"Q: How can our application benefit language learners?")
        qusList.add(11,"Q: Can Entity Extraction be used for sentiment analysis in our application?")
        qusList.add(12,"Q: Does our application support translation for multiple languages?")
        qusList.add(13,"Q: Can we integrate our application with other third-party apps?")
        qusList.add(14,"Q: How often are ML Kit's language models updated?")
        qusList.add(15,"Q: How secure is our Android ML Kit application in terms of data privacy?")
        qusList.add(16,"Q: How can developers get started with integrating our ML Kit into their Android apps?")




        ansList.add(0,"A: Our Android ML Kit application is a versatile tool that integrates four powerful features: Translate, Entity Extraction, Code Scanner (barcode & QR code scanning), and AutoDraw. These features enhance various functionalities within Android apps.")
        ansList.add(1,"A: Yes, once the necessary language models and modules are downloaded, our application can be used offline for Entity Extraction, Code Scanner, and AutoDraw. However, the Translate feature requires an internet connection for real-time language translation.")
        ansList.add(2,"A: The Translate feature utilizes ML Kit's language models to provide real-time translation of text from one language to another, facilitating multilingual communication.\n")
        ansList.add(3,"A: Entity Extraction allows our application to recognize structured data within text, enabling efficient data analysis, content categorization, and sentiment analysis.")
        ansList.add(4,"A: ML Kit's Entity Extraction feature uses state-of-the-art machine learning models, providing high accuracy in recognizing entities within text.")
        ansList.add(5,"A: The Code Scanner simplifies barcode and QR code scanning, eliminating the need to request camera permission and streamlining the scanning process.")
        ansList.add(6,"A: The Code Scanner can be used for inventory management, ticketing, mobile payments, loyalty programs, and more, making it versatile for various industries.")
        ansList.add(7,"A: Yes, ML Kit's Code Scanner is designed to handle various code conditions, including damaged or low-quality codes, ensuring reliable scanning performance.")
        ansList.add(8,"A: AutoDraw is a unique feature that uses ML Kit's Digital Ink Recognition to convert hand-drawn sketches into digital illustrations automatically.")
        ansList.add(9,"A: Yes, AutoDraw is equipped to recognize a wide range of hand-drawn shapes, enabling users to create digital illustrations effortlessly.")
        ansList.add(10,"A: Language learners can utilize the Translate feature to enhance their understanding of foreign words and phrases, facilitating language learning both online and offline.")
        ansList.add(11,"A: Yes, Entity Extraction can identify entities associated with specific sentiments, enabling sentiment analysis for social media, feedback, and customer review applications.")
        ansList.add(12,"A: Yes, the Translate feature in our app supports a diverse set of languages, making it valuable for users across the globe, both online and offline.")
        ansList.add(13,"A: Yes, our Android ML Kit application is designed with flexible APIs, allowing easy integration with other third-party apps and services, ensuring a seamless user experience.")
        ansList.add(14,"A: Google regularly updates ML Kit's language models to improve accuracy, enhance features, and include support for additional languages, both online and offline.")
        ansList.add(15,"A: Our application adheres to industry-standard data privacy and security practices, ensuring the protection of user data, even when used offline.")
        ansList.add(16,"A: Developers can refer to the comprehensive documentation and code samples provided by us to easily integrate ML Kit features into their apps. They can also utilize the offline capabilities of Entity Extraction, Code Scanner, and AutoDraw to enhance user experience in their offline-first applications.")








        binding.faqRV.layoutManager = LinearLayoutManager(context)


        recyclerView= binding.faqRV
        recyclerView.layoutManager=LinearLayoutManager(context)
        useradapter = FaqAdapter()
        binding.faqRV.adapter = useradapter

        showlist()

//        setupListener()
//        inflateViews()
    }

    private fun inflateViews() {

    }

    private fun showlist() {
        useradapter.updateQusList(qusList,ansList)
    }

    private fun setupListener() {
    }
}