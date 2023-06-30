package DiaryTest;
import org.junit.jupiter.api.Test;
import  static org.junit.jupiter.api.Assertions.*;
public class DiaryTest {
        Diary diary = new Diary("userName", "password");
        Diary diary2 = new Diary("userName","password");
        @Test
        public void testForDiary(){
            assertNotNull(diary);
        }
        @Test
        public void testForDiaryLockedByDefault(){
            assertTrue(diary.isLocked());
        }
        @Test
        public void lockedDiaryCanBeUnlocked(){
            assertTrue(diary.isLocked());
            diary.unlockWith("password");
            assertFalse(diary.isLocked());
        }

        @Test
        public void lockedDiaryCannotBeUnlockedWithWrongPasswordTest(){
            assertTrue(diary.isLocked());
            diary.unlockWith("wrong password");
            assertTrue(diary.isLocked());
        }

        @Test
        public void unlockDiaryCanBeLockedTest(){
            diary.unlockWith("password");
            assertFalse(diary.isLocked());
            diary.lock();
            assertTrue(diary.isLocked());
        }

        @Test
        public void unlockDiaryCanCreateGistTest(){
            diary.unlockWith("password");
            assertFalse(diary.isLocked());
            diary.addGist("Title", "Body");
           // assertEquals(1, diary.countGists());
        }

        @Test
        public void createGist_findGistByTitleReturnCreatedGistTest(){
//            given
           diary.unlockWith("password");
//           give that i add title
            diary.addGist("Title", "Body");
//            when i create
            Gist gist = diary.findGistByTitle("Title");
            assertEquals("Body", gist.getBody());
            diary.addGist("mmm","goo");
            Gist gist1 = diary.findGistByTitle("mmm");
            assertEquals("goo",gist1.getBody());
        }

        @Test
         public void  testThatDeleteCanBeDeleteWhenFindByIdGistTest(){
            diary.addGist("Title", "Body");
            diary.addGist("titles", "bodies");
            diary.deleteGistById(1);
            assertEquals(1,diary.numberOfGists());
        }
        @Test
    public void testThatDiaryCanBeDeletedWithDeleteWithTitle(){
            diary.addGist("Title","body");
            diary.removeGistByTitle("Title");
            assertEquals(0,diary.numberOfGists());
        }







}


