package com.example.springtemplate;

import lombok.Data;

@Data
public class ClickCountRequestDTO {
    int clickCount;
    YesOrNotEnum yesOrNotEnum;
}