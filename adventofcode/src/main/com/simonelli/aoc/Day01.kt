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
    var result = 0

    input.forEach {value -> result += value.toInt() }

    return result
}

fun alg02(input: List<String> ): Int {
    var frequencies = HashSet<Int>()
    var idx = 0
    var frequency = 0

    while(true) {
        idx = if (idx  >= input.size) 0 else idx

        frequency += input.get(idx).toInt()

        if (frequencies.contains(frequency)) return frequency

        frequencies.add(frequency)
        idx++
    }
}