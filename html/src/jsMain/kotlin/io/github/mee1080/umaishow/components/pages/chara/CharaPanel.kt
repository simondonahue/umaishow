/*
 * Copyright 2021 mee1080
 *
 * This file is part of umaishow.
 *
 * umaishow is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * umaishow is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with umaishow.  If not, see <https://www.gnu.org/licenses/>.
 */
package io.github.mee1080.umaishow.components.pages.chara

import androidx.compose.runtime.Composable
import io.github.mee1080.umaishow.components.common.LabeledRadio
import io.github.mee1080.umaishow.onClickOrTouch
import io.github.mee1080.umaishow.vm.State
import io.github.mee1080.umaishow.vm.ViewModel
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.color
import org.jetbrains.compose.web.css.display
import org.jetbrains.compose.web.dom.Button
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text

@Composable
fun CharaPanel(state: State, model: ViewModel) {
    Div({ style { display(DisplayStyle.Flex) } }) {
        Div {
            CharaSelect("Display Target:", state.charaList.childList, state.charaSelection.child) { model.updateChild(it) }
            if (!state.charaSelection.childSelected) {
                Div { Text("Select a character to display 3-generation affinity") }
            } else if (state.charaSelection.combinationError) {
                Div({ style { color(Color.red) } }) { Text("Combination Duplicate") }
            } else {
                val totalRelation = state.charaSelection.totalRelation
                Div { Text("Total Affinity: ${totalRelation}") }
                if (totalRelation >= 151) {
                    Div { Text("◎ Confirmed") }
                } else {
                    Div { Text("◎ with ${151 - totalRelation} Common Major Races") }
                }
            }
            if (state.charaSelection.childSelected) {
                Div {
                    LabeledRadio("order", "1", "Affinity Order", state.charaSelection.orderByRelation) {
                        model.updateOrderByRelation(true)
                    }
                    LabeledRadio("order", "0", "Name Order", !state.charaSelection.orderByRelation) {
                        model.updateOrderByRelation(false)
                    }
                }
            }
        }
        if (state.charaSelection.childSelected) {
            Div {
                Div({ style { display(DisplayStyle.Flex) } }) {
                    CharaSelect(
                        "Parent 1:",
                        state.charaSelection.parent1List,
                        state.charaSelection.parent1
                    ) { model.updateParent1(it) }
                    Div {
                        CharaSelect("Grandparent 1-1:", state.charaSelection.parent11List, state.charaSelection.parent11) {
                            model.updateParent11(it)
                        }
                        CharaSelect("Grandparent 1-2:", state.charaSelection.parent12List, state.charaSelection.parent12) {
                            model.updateParent12(it)
                        }
                    }
                }
                Div({ style { display(DisplayStyle.Flex) } }) {
                    CharaSelect(
                        "Parent 2:",
                        state.charaSelection.parent2List,
                        state.charaSelection.parent2
                    ) { model.updateParent2(it) }
                    Div {
                        CharaSelect("Grandparent 2-1:", state.charaSelection.parent21List, state.charaSelection.parent21) {
                            model.updateParent21(it)
                        }
                        CharaSelect("Grandparent 2-2:", state.charaSelection.parent22List, state.charaSelection.parent22) {
                            model.updateParent22(it)
                        }
                    }
                }
                Div {
                    Button({
                        onClickOrTouch { model.autoSetParents() }
                    }) {
                        Text("Auto-set for High Affinity")
                    }
                    LabeledRadio("auto", "0", "All Uma Musume", state.autoSetParentsTarget == 0) {
                        model.updateAutoSetParentsTarget(0)
                    }
                    LabeledRadio("auto", "1", "Owned Only", state.autoSetParentsTarget == 1) {
                        model.updateAutoSetParentsTarget(1)
                    }
                    Button({
                        onClickOrTouch { model.clearParents() }
                    }) {
                        Text("Clear All Settings")
                    }
                }
            }
        }
    }
}