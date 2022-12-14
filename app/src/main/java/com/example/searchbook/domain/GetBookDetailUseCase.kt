package com.example.searchbook.domain

import com.example.searchbook.repository.BookRepository

internal class GetBookDetailUseCase(
    private val bookRepository: BookRepository
) {
    suspend operator fun invoke(isbn: String): BookDetail {
        return bookRepository.getBookDetail(isbn)
    }
}