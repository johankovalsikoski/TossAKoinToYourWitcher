package johan.kovalsikoski.tossakointoyourwitcher

import junit.framework.Assert.assertEquals
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.koin.core.context.startKoin
import org.koin.core.context.stopKoin
import org.koin.test.KoinTest
import org.koin.test.inject

@RunWith(JUnit4::class)
class MainViewModelTest: KoinTest {

    private val viewModel by inject<MainViewModel>()

    @Before
    fun setup() {
        startKoin {
            modules(
                listOf(
                    mainViewModelModule
                )
            )
        }

    }

    @After
    fun cleanUp() {
        stopKoin()
    }

    @Test
    fun `return click`() {
        assertEquals("Click", viewModel.returnClick())
    }

    @Test
    fun `return longclick`() {
        assertEquals("Long Click", viewModel.returnLongClick())
    }

}