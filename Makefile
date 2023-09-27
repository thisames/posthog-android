.PHONY: clean compile stop checkFormat format api dryRelease release testReport test

clean:
	./gradlew clean

compile:
	./gradlew build

# We stop gradle at the end to make sure the cache folders
# don't contain any lock files and are free to be cached.
stop:
	./gradlew --stop

checkFormat:
	./gradlew spotlessCheck

format:
	./gradlew spotlessApply

api:
	./gradlew apiDump

dryRelease:
	./gradlew publishToMavenLocal

release:
	./gradlew publishToSonatype closeAndReleaseSonatypeStagingRepository

testReport:
	./gradlew koverHtmlReport

# compile already runs the tests
test:
	./gradlew testDebugUnitTest
