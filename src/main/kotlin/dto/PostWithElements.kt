package ru.netology.dto

import kotlinx.coroutines.Deferred

data class PostWithElements(
    val post: Post,
    val author: Author,
    val comments: List<CommentWithAuthor>,
        )