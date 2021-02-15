package golden.pack

sealed class Exhaustive() {
    object Yes : Exhaustive()
    object No: Exhaustive()
}