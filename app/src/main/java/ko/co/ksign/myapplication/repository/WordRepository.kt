package ko.co.ksign.myapplication.repository

import androidx.annotation.WorkerThread
import ko.co.ksign.myapplication.dao.WordDao
import ko.co.ksign.myapplication.entity.Word
import kotlinx.coroutines.flow.Flow

class WordRepository(private val wordDao: WordDao) {

    val allWords: Flow<List<Word>> = wordDao.getAlphabetizedWords()

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(word: Word) {
        wordDao.insert(word)
    }

}