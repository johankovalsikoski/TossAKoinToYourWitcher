package johan.kovalsikoski.tossakointoyourwitcher

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var _points = MutableLiveData(0)
    val points: LiveData<Int>
        get() = _points

    fun returnClick() = "Click"

    fun returnLongClick() = "Long Click"

    fun addPoint() {
        _points.value = (_points.value)?.plus(1)
    }

    fun removePoint() {
        _points.value = (_points.value)?.minus(1)
    }

}