package jokes.com.multibhashi_assignment_jokes

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class ViewPagerAdapter internal constructor(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    private val COUNT = 2

    override fun getItem(position: Int): Fragment? {
        var fragment: Fragment? = null
        when (position%2) {
            0 -> fragment = FirstFragment()
            1 -> fragment = SecondFragment()
        }

        return fragment
    }

    override fun getCount(): Int {
        return COUNT
    }

}