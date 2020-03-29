package ashwan.dhelian.project


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_hobi3.*
import kotlinx.android.synthetic.main.fragment_lininer.*

/**
 * A simple [Fragment] subclass.
 */
class lininerFragment : Fragment() {

    lateinit var nav : NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lininer, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        nav = Navigation.findNavController(view)

        masuk.setOnClickListener {
            nav.navigate(R.id.action_lininerFragment_to_awalFragment)
        }
    }
}
