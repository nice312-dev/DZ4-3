import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add_post_id_more_then_0() {
        val post = Post(
            id = 0L,
            ownerId = 10,
            fromId = 10,
            createdBy = 10,
            date = 20201217,
            text = "post text",
            donut = Donut()
        )

        val actual = WallService.add(post).id

        assertTrue("Ожидалось, что добавленное сообщение будет иметь id отличный от 0.", actual > 0L)
    }

    @Test
    fun update_post_exists() {
        val post = Post(
            id = 0L,
            ownerId = 20,
            fromId = 20,
            createdBy = 20,
            date = 20201217,
            text = "some text",
            donut = Donut()
        )

        val addedPost = WallService.add(post)

        assertTrue("Ожидалось, что произойдёт редактирование существующего сообщения",
            WallService.update(addedPost))
    }

    @Test
    fun update_post_not_exists() {
        val addedPost = Post(
            id = 0L,
            ownerId = 30,
            fromId = 30,
            createdBy = 30,
            date = 20201217,
            text = "some text",
            donut = Donut()
        )

        val passedPost = Post(
            id = 0L,
            ownerId = 40,
            fromId = 40,
            createdBy = 40,
            date = 20201217,
            text = "some text",
            donut = Donut()
        )

        WallService.add(addedPost)

        assertFalse("Ожидалось, что редактирования несуществующего сообщения не произойдёт.",
            WallService.update(passedPost))
    }
}