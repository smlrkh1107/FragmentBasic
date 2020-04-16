package kun.hee.fragmentbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // 얘는 Main을 켜주는데, 나머지 조각화면은 어떻게 연결할까?
    }


    override fun setupEvents() {

    }

    override fun setValues() {

    }


}
