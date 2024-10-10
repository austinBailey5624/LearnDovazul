package com.greenwolfgames.myapplication

class AlphabetCharacter(val index: Int, val characters: String, val letterName: String, val phoneticExample: String, val characterSoundtype: ECharacterSoundType)
{

    companion object
    {
        fun getAlphabet(): List<AlphabetCharacter>
        {
            val alphabet = mutableListOf<AlphabetCharacter>()
            for(i in 1..34)
            {
                alphabet.add(getAlphabetLetter(i))
            }
            return alphabet
        }

        fun getAlphabetLetter(index: Int): AlphabetCharacter
        {
            return when (index)
            {
                1 -> AlphabetCharacter(1,"a","az", "short a is in \'cat\'", ECharacterSoundType.VOWEL)
                2 -> AlphabetCharacter(2,"aa","aan","Long a is in \'father\'", ECharacterSoundType.VOWEL)
                3 -> AlphabetCharacter(3,"ah","hah","Long a is in \'father\'(alternate)", ECharacterSoundType.VOWEL)
                4 -> AlphabetCharacter(4, "b","bey","b as in \'bread\')", ECharacterSoundType.CONSONANT)
                5 -> AlphabetCharacter(5,"d","dah","d as in \'door\'", ECharacterSoundType.CONSONANT)
                6 -> AlphabetCharacter(6, "e","en","short e as in \'net\'", ECharacterSoundType.CONSONANT)
                7 -> AlphabetCharacter(7, "ei","hei","long ei as in \'why\'", ECharacterSoundType.CONSONANT)
                8 -> AlphabetCharacter(8,"ey","hey","long ey as in \'hey\'", ECharacterSoundType.CONSONANT)
                9 -> AlphabetCharacter(9,"f","fo","f as in \'frost\'", ECharacterSoundType.CONSONANT)
                10 -> AlphabetCharacter(10,"g","gah","g as in \'gold\'", ECharacterSoundType.CONSONANT)
                11 -> AlphabetCharacter(11,"h","hes","h as in \'hello\''", ECharacterSoundType.CONSONANT)
                12 -> AlphabetCharacter(12, "i","in","i as in \'win\'", ECharacterSoundType.VOWEL)
                13 -> AlphabetCharacter(13,"ii","kii","ee as in \'see\'", ECharacterSoundType.VOWEL)
                14 -> AlphabetCharacter(14, "ir","hir","ea as in \'hear\'", ECharacterSoundType.VOWEL)
                15 -> AlphabetCharacter(15,"j","jen","j as in \'just\'", ECharacterSoundType.CONSONANT)
                16 -> AlphabetCharacter(16,"k","kei","k as in \'keen\'", ECharacterSoundType.CONSONANT)
                17 -> AlphabetCharacter(17,"l","li","l as in \'lore\'", ECharacterSoundType.CONSONANT)
                18 -> AlphabetCharacter(18,"m","mah","m as in \'mother\'", ECharacterSoundType.CONSONANT)
                19 -> AlphabetCharacter(19,"n","ni","n as in \'no\'", ECharacterSoundType.CONSONANT)
                20 -> AlphabetCharacter(20, "o","ot","short o as in \'foe\'", ECharacterSoundType.VOWEL)
                21 -> AlphabetCharacter(21,"oo","thoor","long o as in \'lore\'", ECharacterSoundType.VOWEL)
                22 -> AlphabetCharacter(22,"p","pah","p as in \'map\'", ECharacterSoundType.CONSONANT)
                23 -> AlphabetCharacter(23,"q","qo","q as in \'quote\'", ECharacterSoundType.CONSONANT)
                24 -> AlphabetCharacter( 24, "r","rah","r as in \'run\'", ECharacterSoundType.CONSONANT)
                25 -> AlphabetCharacter(25, "s", "set", "s as in \'soft\'", ECharacterSoundType.CONSONANT)
                26 -> AlphabetCharacter(26, "t","tag","t as in \'tale\'", ECharacterSoundType.CONSONANT)
                27 -> AlphabetCharacter(27, "u","un","oo in \'fool\'", ECharacterSoundType.VOWEL)
                28 -> AlphabetCharacter(28,"uu","huul","oo in \'fool\'", ECharacterSoundType.VOWEL)
                29 -> AlphabetCharacter(29,"ur","nur","ure as in \'lure\'", ECharacterSoundType.VOWEL)
                30 -> AlphabetCharacter(30,"v","vey","v as in \'valley\'", ECharacterSoundType.CONSONANT)
                31 -> AlphabetCharacter(31,"w","wo","w as in \'world\'", ECharacterSoundType.CONSONANT)
                32 -> AlphabetCharacter(33,"x","nex","x as in \'axe\'", ECharacterSoundType.CONSONANT)
                33 -> AlphabetCharacter(34,"y","yeh","y as in \'yet\'", ECharacterSoundType.CONSONANT)
                34 -> AlphabetCharacter(35,"z","zet","z as in \'zoo\'", ECharacterSoundType.CONSONANT)
                else -> throw IllegalArgumentException("AlphabetCharacter: asked for an alphabet letter index outside of those that exist")
            }
        }
    }
}