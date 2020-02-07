package johan.kovalsikoski.tossakointoyourwitcher

import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val mainViewModelModule = module {
    viewModel { MainViewModel() }
}