package com.example.firstkotlinmutliplatformmobileapp.shared


class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}
