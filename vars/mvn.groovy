import com.github.drylib.Maven

def call(String phases) {
    new Maven().executePhases(phases)
}