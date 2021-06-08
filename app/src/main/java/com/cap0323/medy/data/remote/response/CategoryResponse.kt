package com.cap0323.medy.data.remote.response

import com.google.gson.annotations.SerializedName

data class CategoryResponse(
    @field:SerializedName("category")
    val category: String? = null,
)

