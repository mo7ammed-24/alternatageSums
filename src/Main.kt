fun main() {
    println(alternatingSums(mutableListOf(50, 60, 60, 45, 70)))
}

fun alternatingSums(a: MutableList<Int>): MutableList<Int> {
    var firstTeam=0
    var secondTeam=0
    var teamList=mutableListOf<Int>()
    firstTeam=a[0]
    for(i in 1 until a.size)
        if(i%2==0)
            firstTeam+=a[i]
        else
            secondTeam+=a[i]

    teamList.add(firstTeam)
    teamList.add(secondTeam)

    return teamList
}
