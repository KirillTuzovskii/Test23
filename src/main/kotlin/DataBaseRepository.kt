interface DataBaseRepository {

	fun getUsers()
}

public class DataBaseRepositoryImpl:DataBaseRepository {

	override fun getUsers() {
		println("wee!")
	}


}