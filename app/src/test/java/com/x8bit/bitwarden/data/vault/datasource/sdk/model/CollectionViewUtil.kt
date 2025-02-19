package com.x8bit.bitwarden.data.vault.datasource.sdk.model

import com.bitwarden.vault.CollectionView

/**
 * Create a mock [CollectionView] with a given [number].
 */
fun createMockCollectionView(
    number: Int,
    name: String? = null,
    readOnly: Boolean = false,
    manage: Boolean = true,
): CollectionView =
    CollectionView(
        id = "mockId-$number",
        organizationId = "mockOrganizationId-$number",
        hidePasswords = false,
        name = name ?: "mockName-$number",
        externalId = "mockExternalId-$number",
        readOnly = readOnly,
        manage = manage,
    )
