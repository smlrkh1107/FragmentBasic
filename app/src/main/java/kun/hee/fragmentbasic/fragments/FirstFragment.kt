package kun.hee.fragmentbasic.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kun.hee.fragmentbasic.R

//최신버전이므로 android X 잇는걸루다가
class FirstFragment :Fragment() {
//    조각나있지만 얘도 화면에 올라갈 애야.ㅎㅎ XML파일 별도로 생성해야해. ~~!


//    조각난 화면을 이어붙여주기.!
    override fun onCreateView(
        inflater: LayoutInflater, //어댑터에서 xml을 변수에 담아줄때 봤을거같지않니?
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first,container,false)
                                                    //false:루트까지도 갖다붙일거니?
//    mainActivity와 setContentView한거와 같은 의미다.
    }
}