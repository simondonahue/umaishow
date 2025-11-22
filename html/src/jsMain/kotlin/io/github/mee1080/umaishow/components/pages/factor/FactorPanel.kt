package io.github.mee1080.umaishow.components.pages.factor

import androidx.compose.runtime.Composable
import io.github.mee1080.umaishow.components.common.LabeledSlider
import io.github.mee1080.umaishow.roundToPercentString
import io.github.mee1080.umaishow.style.AppStyleSheet
import io.github.mee1080.umaishow.vm.FactorState
import io.github.mee1080.umaishow.vm.ViewModel
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*

@Composable
fun FactorPanel(state: FactorState, model: ViewModel) {
    H2 { Text("Factor Farming or Main Training Decision") }
    Div { Text("Calculates whether you should continue factor farming or compromise and proceed to main training.") }
    Div({
        style {
            display(DisplayStyle.Flex)
            flexWrap(FlexWrap.Wrap)
        }
    }) {
        Div({
            style {
                width(100.percent)
                maxWidth(700.px)
            }
        }) {
            H3 { Text("Probability of Main Training Success with Current Factors") }
            Div { Text("*Enter the probability of getting all aptitude skills and stats, including factor activation") }
            LabeledSlider(state.realSuccessRate, 1, 1000, toDisplay, { model.calcFactorState() }) {
                model.updateFactorState { copy(realSuccessRate = it.toInt()) }
            }
            H3 { Text("Probability of Factor Farming Success") }
            Div { Text("*Although it can't be simply measured by the number of white factors, it is calculated as a binary success/failure for simplification") }
            LabeledSlider(state.circlingSuccessRate, 1, 1000, toDisplay, { model.calcFactorState() }) {
                model.updateFactorState { copy(circlingSuccessRate = it.toInt()) }
            }
            H3 { Text("Probability of Main Training Success after Factor Farming Success") }
            Div { Text("*Enter the probability of getting all aptitude skills and stats after successful factor farming with the above probability") }
            LabeledSlider(state.circlingRealSuccessRate, 1, 1000, toDisplay, { model.calcFactorState() }) {
                model.updateFactorState { copy(circlingRealSuccessRate = it.toInt()) }
            }
            H3 { Text("Planned Training Count") }
            LabeledSlider(state.challengeCount, 0, 100, onChange = { model.calcFactorState() }) {
                model.updateFactorState { copy(challengeCount = it.toInt()) }
            }
        }
        Div({
            style {
                width(100.percent)
                maxWidth(480.px)
            }
        }) {
            H3 { Text("Calculation Results") }
            if (state.result.isNotEmpty()) {
                Div { Text("Max Factor Farming Count: ${state.maxRateIndex} times") }
                Table({ classes(AppStyleSheet.table) }) {
                    Tr {
                        Th { Text("Max Factor Farming Count") }
                        Th { Text("Main Training Success Rate within Planned Count") }
                        Th { Text("Max") }
                    }
                    state.result.forEachIndexed { index, rate ->
                        Tr {
                            Td { Text(index.toString()) }
                            Td {
                                Text(rate.roundToPercentString(100))
                            }
                            Td({ style { textAlign("center") } }) {
                                if (index == state.maxRateIndex) Text("★")
                            }
                        }
                    }
                }
                Div { Text("*Simulates the probability of main training success if you succeed in factor farming or farm up to the max count and then use the remaining count for main training") }
                Div { Text("*In short, factor farming should be done at most up to the count marked with ★") }
            }
        }
    }
}

private val toDisplay: (Number) -> String = { "${it.toInt() / 10}.${it.toInt() % 10}" }