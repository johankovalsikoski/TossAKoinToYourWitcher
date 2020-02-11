package johan.kovalsikoski.tossakointoyourwitcher

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import junit.framework.Assert.assertEquals
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TestRule
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.koin.core.context.startKoin
import org.koin.core.context.stopKoin
import org.koin.test.KoinTest
import org.koin.test.inject
import org.mockito.MockitoAnnotations

@RunWith(JUnit4::class)
class MainViewModelTest: KoinTest {

    private val viewModel by inject<MainViewModel>()

    @get:Rule
    var rule: TestRule = InstantTaskExecutorRule()

    @Before
    fun setup() {
        startKoin {
            modules(
                listOf(
                    mainViewModelModule
                )
            )
        }

        MockitoAnnotations.initMocks(this)

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

    @Test
    fun `add point to point live data 0 should be 1`() {
        viewModel.addPoint()
        assertEquals(1, viewModel.points.value)
    }

    @Test
    fun `remove point from point live data 0 should be -1`() {
        viewModel.removePoint()
        assertEquals(-1, viewModel.points.value)
    }

}