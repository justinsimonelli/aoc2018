package main.com.simonelli.aoc

import com.simonelli.aoc.FileReader


fun main(args: Array<String>){
    val puzzleInput: List<String> = FileReader()
            .getPuzzleInput("src/main/resources/day1.txt")
            .split("\n")

    println("solution1 value = ${alg01(puzzleInput)}")
    println("solution2 value = ${alg02(puzzleInput)}")
}

fun alg01(input: List<String> ): Int {
    return input.map { v -> v.toInt() }.sum()
}

fun alg02(input: List<String> ): Int {
    var frequencies = HashSet<Int>()
    var idx = 0
    var frequency = 0

    while(true) {
        idx = if (idx  >= input.size) 0 else idx

        frequency += input.map { v -> v.toInt() }.get(idx)

        if (frequencies.contains(frequency)) return frequency

        frequencies.add(frequency)
        idx++
    }
}