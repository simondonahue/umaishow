package io.github.mee1080.umaishow.pages.table

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import io.github.mee1080.common.atoms.LabeledRadioButton
import io.github.mee1080.common.atoms.MyButton
import io.github.mee1080.common.atoms.SelectBox
import io.github.mee1080.umaishow.vm.FilterMode
import io.github.mee1080.umaishow.vm.State
import io.github.mee1080.umaishow.vm.ViewModel

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun SettingBlock(state: State, viewModel: ViewModel) {
    val tableState by derivedStateOf { state.tableState }
    FlowRow(
        horizontalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        SelectBox(
            items = state.charaList.childList,
            selectedItem = state.charaSelection.childEntry,
            onSelect = { viewModel.updateChild(it.first) },
            label = { Text("Display Target") },
            itemToString = { it.second },
        )
        Column {
            FilterSettingPanel(
                label = "Row Display Target",
                mode = tableState.rowFilter.mode,
                showRelationFilterDialog = { viewModel.showRowRelationFilterDialog = true },
                showNameFilterDialog = { viewModel.showRowNameFilterDialog = true },
                update = { viewModel.updateRowFilter { copy(mode = it) } },
            )
            FilterSettingPanel(
                label = "Column Display Target",
                mode = tableState.columnFilter.mode,
                showRelationFilterDialog = { viewModel.showColumnRelationFilterDialog = true },
                showNameFilterDialog = { viewModel.showColumnNameFilterDialog = true },
                update = { viewModel.updateColumnFilter { copy(mode = it) } },
            )
        }
    }
    RelationFilterSettingDialog(
        opened = viewModel.showRowRelationFilterDialog,
        onDismissRequest = { viewModel.showRowRelationFilterDialog = false },
        list = tableState.rowFilter.relation,
        delete = { viewModel.deleteRowRelationFilter(it) },
        add = { viewModel.addRowRelationFilter() },
        edit = { index, value -> viewModel.setRowRelationFilter(index, value) },
    )
    NameFilterSettingDialog(
        opened = viewModel.showRowNameFilterDialog,
        onDismissRequest = { viewModel.showRowNameFilterDialog = false },
        list = tableState.rowFilter.names,
        delete = { viewModel.deleteRowNameFilter(it) },
        add = { viewModel.addRowNameFilter() },
        edit = { index, value -> viewModel.setRowNameFilter(index, value) },
    )
    RelationFilterSettingDialog(
        opened = viewModel.showColumnRelationFilterDialog,
        onDismissRequest = { viewModel.showColumnRelationFilterDialog = false },
        list = tableState.columnFilter.relation,
        delete = { viewModel.deleteColumnRelationFilter(it) },
        add = { viewModel.addColumnRelationFilter() },
        edit = { index, value -> viewModel.setColumnRelationFilter(index, value) },
    )
    NameFilterSettingDialog(
        opened = viewModel.showColumnNameFilterDialog,
        onDismissRequest = { viewModel.showColumnNameFilterDialog = false },
        list = tableState.columnFilter.names,
        delete = { viewModel.deleteColumnNameFilter(it) },
        add = { viewModel.addColumnNameFilter() },
        edit = { index, value -> viewModel.setColumnNameFilter(index, value) },
    )
}

@Composable
fun FilterSettingPanel(
    label: String,
    mode: FilterMode,
    showRelationFilterDialog: () -> Unit,
    showNameFilterDialog: () -> Unit,
    update: (FilterMode) -> Unit,
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(label)
        LabeledRadioButton(
            selected = mode == FilterMode.NONE,
            onClick = { update(FilterMode.NONE) },
        ) { Text("All") }
        LabeledRadioButton(
            selected = mode == FilterMode.RELATION,
            onClick = { update(FilterMode.RELATION) },
        ) { Text("Factor") }
        MyButton(
            onClick = showRelationFilterDialog,
            enabled = mode == FilterMode.RELATION,
        ) { Text("Settings") }
        LabeledRadioButton(
            selected = mode == FilterMode.NAME,
            onClick = { update(FilterMode.NAME) },
        ) { Text("Name") }
        MyButton(
            onClick = showNameFilterDialog,
            enabled = mode == FilterMode.NAME,
        ) { Text("Settings") }
    }
}