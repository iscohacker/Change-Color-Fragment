package uz.iskandarbek.change_color_fragments

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import uz.iskandarbek.change_color_fragments.databinding.FragmentChangeBinding

class ChangeFragment : Fragment() {
    private val binding by lazy { FragmentChangeBinding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnNext.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.mycontainer, ColorsFragment())
                .addToBackStack(null)
                .commit()
        }
        binding.resetBtn.setOnClickListener {
            binding.root.setBackgroundColor(Color.WHITE)
        }
    }

    override fun onResume() {
        super.onResume()
        val root = binding.root
        if (MyColor.color != "") {
            root.setBackgroundColor(Color.parseColor(MyColor.color))
        }
    }
}
