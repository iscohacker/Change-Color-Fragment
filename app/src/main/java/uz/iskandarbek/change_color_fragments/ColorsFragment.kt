package uz.iskandarbek.change_color_fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import uz.iskandarbek.change_color_fragments.databinding.FragmentColorsBinding

class ColorsFragment : Fragment() {
    private val binding by lazy { FragmentColorsBinding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.qora.setOnClickListener {
            MyColor.color = "#000000"
        }

        binding.sariq.setOnClickListener {
            MyColor.color = "#FFEB3B"
        }

        binding.qizil.setOnClickListener {
            MyColor.color = "#FF0000"
        }

        binding.yashil.setOnClickListener {
            MyColor.color = "#01C809"
        }

        binding.kok.setOnClickListener {
            MyColor.color = "#0023FF"
        }

        binding.pushti.setOnClickListener {
            MyColor.color = "#FF00F2"
        }

        binding.binafsha.setOnClickListener {
            MyColor.color = "#9C27B0"
        }
    }
}
