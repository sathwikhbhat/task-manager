package com.sathwikhbhat.taskmanager.dto;

import com.sathwikhbhat.taskmanager.entities.NoteEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CreateNoteResponseDTO {

    private Integer taskId;
    private NoteEntity note;

}