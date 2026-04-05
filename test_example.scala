// Test script for VoiceIt3 Scala SDK
// Run: sbt console, then :load test_example.scala

import voiceit3.VoiceIt3

object TestExample extends App {
  val apiKey = sys.env.getOrElse("VOICEIT_API_KEY", { println("Set VOICEIT_API_KEY"); sys.exit(1); "" })
  val apiToken = sys.env.getOrElse("VOICEIT_API_TOKEN", { println("Set VOICEIT_API_TOKEN"); sys.exit(1); "" })

  val vi = new VoiceIt3(apiKey, apiToken)

  println("CreateUser: " + vi.createUser())
  println("GetAllUsers: " + vi.getAllUsers())
  println("CreateGroup: " + vi.createGroup("Test Group"))
  println("GetAllGroups: " + vi.getAllGroups())
  println("GetPhrases: " + vi.getPhrases("en-US"))

  println("\nAll API calls completed successfully!")
}
