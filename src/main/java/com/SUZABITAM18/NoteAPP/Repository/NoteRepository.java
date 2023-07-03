package com.SUZABITAM18.NoteAPP.Repository;

import com.SUZABITAM18.NoteAPP.Entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
}
