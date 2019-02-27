(ns sartar-clan-questionnaire.questions)

(def questions
  [{:title "1. The Council of Pairs"
    :description "The council of Pairs were eight Old Gods of the Celestial Court who embodied the great, opposing runic powers. They resided in the Cosmic Mountain at the center of the world and had equally contributed to the creation of Darhudan and Darhudana. However, each child of Grandfather and Grandmother Life favoured one Old God over the others."
    :query "Which Old God did your clan ancestor favour?"
    :options [{:title "Acos, God of Stability" :rune :stasis :modifiers {:stasis 1}}
              {:title "Larnste, God of Movement" :rune :movement :modifiers {:movement 1}}
              {:title "Uleria, Goddess of Love" :rune :life :modifiers {:life 1}}
              {:title "Kargan Tor, God of Conflict" :rune :death :modifiers {:death 1}}
              {:title "Orenoar, Goddess of Truth" :rune :truth :modifiers {:truth 1}}
              {:title "Tylena, Goddess of Illusion" :rune :illusion :modifiers {:illusion 1}}
              {:title "Harana Ilor, Goddess of Harmony" :rune :harmony :modifiers {:harmony 1}}
              {:title "Ratslaff, God of Disorder" :rune :disorder :modifiers {:disorder 1}}]}
   {:title "2. The Treasured People"
    :description "The Goddess Asrelia, the Empress Earth, gave out many treasures to the descendants of Grandfather and Grandmother Life. The treasure she gave to your people awoke them from the formless Green Age and named them as something specific."
    :query "Which treasure did Asrelia give to your people?"
    :options [{:title "The Rich Swan" :modifiers {:wealth 1 :earth 1}}
              {:title "The Full Dish and Spoon" :modifiers {:war 1 :air 1}}]}
   {:title "3. The First Ceremony"
    :description "At first, no one was ever hungry, for Asrelia contained enough to feed everyone. But suddenly some people were hungry! Ernalda stopped the hunger by teaching people how to do the right ceremonies. These allowed people to find her sister Esrola, who had been trapped behind a terrible mask by Angdartha, the cruel servant of the Bright Emperor. This was the first worship, one of the actions that separated mortals from deities."
    :query "What ritual did your ancestor lead?"
    :disabled_by [1 1]
    :options [{:title "**We did the Flax Dance.** The people danced until the flax fell apart. They were tired, and while they rested, Ernalda taught them how to make the flax into fibers." :modifiers {:earth 2 :life 2 :peace 1}}
              {:title "**We did the Goose Dance.** The people danced until the goose fell apart. They were tired again and, while they rested, Ernalda showed them how to prepare all the parts of a goose: which parts made tools, costumes, and charms; and how to make it into portions." :modifiers {:earth 1 :harmony 1 :morale 1}}
              {:title "**We did the Sacrifice Dance.** The people danced until the crowd fell apart. They were tired again, and while they rested Ernalda showed some of them how to burn one portion of the goose to appease the messenger with the stick, and others how to cook the rest of the goose into food." :modifiers {:earth 2 :magic 1}}
              {:title "We did not dance, but instead made the vessels in which the flax and geese were sacrificed." :modifiers {:wealth 1 :earth 2}}]
    :input {:title "Give your clan wyter a magical ability relating to your answer" :meaning :wyter_ability}}
   {:title "4. Umath Creates Freedom"
    :query "When did your ancestros help Umath?"
    :description "The Bright Emperor enslaved everyone and demanded absolute obedience from everything. But there was one force he could not control, and that was freedom. One little freedom became many, and they began to bring bigger freedoms. Finally, the Great Sky lay upon the Fertile Earth and begot Umath Ever-Changing, the First Storm, who would bring change to the Bright Emperor's stagnant realm. Umath was an upstart god at first, with only a few crazy and dangerous brothers at his side. Gradually he gathered gods and men to his band and with their help reshaped the world."
    :disabled_by [1 0]
    :options [{:title "Separating the Sky and Earth from each other"
               :modifiers {:magic 1 :air 2 :movement 2}
               :special "Slogan: 'Violence is always an option'"}
              {:title "Defying the Bright Emperor"
               :modifiers {:war 1 :air 3}
               :special "Slogan: \"No one can make you do anything\""}]}
   {:title "5. Why You Joined Orlanth"
    :query "You originally joined the Army of Orlanth because..."
    :description "Death was the first thing that set people apart from the gods. Grandfather Life was the first to be killed with Death and afterwards was called Grandfather Mortal. Because of that, all of his descendents have been set apart from the gods, even after death came to the gods as well.\n\n Umath was destroyed by the Emperor's bloody lieutenant, the Red God Jagrekriand, which set off the horrible time called The Gods War. In that turbulent era, the parts of the world fought itself; gods grappled, and threw landmarks at each other. The Old Gods of the Celestial Court were destroyed and shattered.\n\n  Amid the destruction, the mortal peoples adapted to survive or died off. Different peoples had different ways to cope. Umath's youngest and wisest son, Orlanth, was initially one of the many upstart, rebellious deities bent upon conquest of the world. Orlanth's unique contributions at the time were his honor and his kinship to the deities of Air. Where the Bright Emperor sought to control people through fear, force, and hollow laws, Orlanth gathered his people by force of virtue, character, and example."
    :options [{:title "You knew that he would be great right from the start." :modifiers {:air 3} :special "+3 when calling Orlanth for divination"}
              {:title "You met him when he was young and explored the world below the Great Mountain." :modifiers {:air 2 :movement 1}}
              {:title "He challenged the Bright Emperor to Contests of Dancing, Magic, and Music, and then killed the Emperor with his new weapon, Death. " :modifiers {:air 3 :movement 2}}
              {:title "He found the new weapon called Death, and used it to kill the Evil Emperor at the Battle of Extinguish Field. " :modifiers {:air 3 :death 1}}
              {:title "He wooed Ernalda, won her heart, and created the Marriage Ring. " :modifiers {:air 1 :harmony 1}}]}
   {:title "6. Your Earliest Famous Event "
    :query "Your earliest Famous Event was:"
    :description "You fought in the many wars that Orlanth undertook to conquer the world. These wars helped shape the world. Other more peaceful deeds shaped the world as well."
    :options [{:title "Battle of the Trembling Shore. Where Orlanth and his army raged against the salty gods of the sea, and drove them like froth in a storm." :modifiers {:air 1 :morale 1}}
              {:title "Battle of Extinguish Field. Orlanth met Yelm face to face in open battle, and Orlanth killed Yelm and scattered his army." :modifiers {:air 1 :war 1}}
              {:title "The Thrinbarri Battles. Where Orlanth and his army fought against the sky warriors." :modifiers {:air 1 :wealth 1}}
              {:title "The First Dragonslaying. Where Orlanth killed Sh'harkazeel the Mover of Heavens and took his Dragon Power." :modifiers {:air 1 :magic 1}}
              {:title "The Plundering of Aron. Where Orlanth and his army defeated Seravus the Enchanter and recaptured the Beasts." :modifiers {:air 1 :war 1}}
              {:title "Onetree Exchange. Where Issaries showed Orlanth how to honorably challenge and exchange secrets with Genert." :modifiers {:peace 1 :communication 1}} ;; TODO check this
              {:title "Roitina's Purification. Where Roitina showed mortals how to live in harmony with the gods." :modifiers {:earth 1 :magic 1}}
              {:title "The Ox-Taming. When Barntar tamed the Bull and harnessed oxen to the plow." :modifiers {:earth 1 :wealth 1}}
              {:title "The Fate-Weaving. When Ernalda first revealed the Tapestry of Destiny and the fate of the gods." :modifiers {:earth 1 :magic 1}}
              {:title "The Pot-Making. When Pella the Pottery Goddess first made a pot to store grain in." :modifiers {:earth 1 :wealth 1}}
              {:title "The First Fire Day. When Ernalda tamed the Lowfires and put them to work for the women. " :modifiers {:earth 1 :peace 1}}]}
   {:title "7. Marriage of Orlanth and Ernalda "
    :query "Which side did your ancestors stand on?"
    :description "Orlanth wooed the forces of Earth and after many tribulations, adventures, and discoveries the storm god proved himself worthy of marrying Great Ernalda, the Earth Queen. The two of them created the Marriage Oath and thereby established a great harmony in the world through this sacred bonding.\n\n You, a loyal member of Orlanth's army, were there at the wedding. When you went into the ceremony, you were asked which side you wished to stand on: the right (Air) or left (Earth) side."
    :options [{:title "Air" :rune :air :modifiers {:air 2}}
              {:title "Earth" :rune :earth :modifiers {:earth 2}}
              {:title "We guarded the sacred circle" :modifiers {:magicR 1}}]}
   {:title "8. The Vingkotling Age"
    :query "8.1 Which remnant people joined you?"
    :description "Vingkot was a son of Orlanth and the first great king of the Orlanthi people. The Vingkotlings were great, with full baskets and fat herds and always victorious over their foes. The people set up many altars where the gods lived and so established the relations of worship. King Vingkot led and sent many expeditions against the enemies who wanted to take it away. Vingkot is still worshipped for the great deeds he did, and for his leadership of the gods when Orlanth went away.\n\n Vingkot married the Summer and Winter Wives and with them he had five sons and five daughters. The bloodline of Vingkot was unique and was necessary to be a king. Each son and daughter founded a Vingkotling tribe, except for the Second Son, who traveled to the edge of the world. Vingkot chose his eldest son Kodig to be the high king of all the Vingkotlings and his son's bloodline, called the Kodigvari, were the Royal Tribe of the Vingkotlings.\n\n When the world fell apart, Vingkot welcomed refugees and reorganized the devastated clans, so that all might survive. He asked you to shelter the people of a ruined clan, but let you choose what status to give them."
    :options [{:title "Buf Gart, the \"Hungry Women\"." :modifiers {:darkness 2 :peace 2}}
              {:title "Ched Durkel, the \"Strings\"." :modifiers {:fire 2 :peace 1}}
              {:title "Jars Antanggi, the \"People of the Shadows\"." :modifiers {:darkness 3 :magic 1}}
              {:title "Karantuel, the \"Cloud Folk\"."  :modifiers {:water 3 :war 1}}
              {:title "Korsto Viv, the \"People of the Rivers\"." :modifiers {:water 2 :wealth 1}}
              {:title "Nalda Bin, the \"Stick Farmers\"." :modifiers {:earth 2 :wealth 1}}
              {:title "Aranto Viv, the \"Axe People\"." :modifiers {:earth 3 :war 1}}
              {:title "Eryain Ins, \"The Blondes\"." :modifiers {:fire 3 :morale 1} :special "Your clan members often have blond hair."}
              {:title "Forosto Jann, the \"Deadly Archers\"." :modifiers {:fire 2 :war 1}}]}
   {:title "8. The Vingkotling Age"
    :query "8.2 What status did you give the refugees?"
    :description "You had the choice whether to make them into thralls (slaves) or adopt them into your clan."
    :options [{:title "We made them slaves, and called them thralls." :modifiers {} :special "Your clan keeps thralls."}
              {:title "We made them sheepherders, and called them cottars." :modifiers {} :special "Your clan does not keep thralls."}
              {:title "We gave them equal rights as free men. " :modifiers {} :special "Your clan does not keep thralls."}]}
   {:title "9. Ancient Enemies "
    :query "Who is your clan's Ancient Enemy?"
    :description "The foes of the Vingkotlings were many. As time went on, you found yourself fighting against the same foes over and over again. One enemy in particular plagued your people consistently during the era. Your ancestors fought these foes so often that they developed special magic to combat them.\n\n Even today, your clan does not get along with the descendants of the Ancient Enemy, and your wyter is especially effective against them."
    :tag :ancient-enemy
    :options [{:title "Venebain the Lightfore, leader of the Fire Tribe, heirs to the Evil Empire." :modifiers {:war 1}}
              {:title "The Dragonewts, the dire dragon people." :modifiers {:magic 1}}
              {:title "Mostali and the Stone Tribe, made up of the change-hating dwarves." :modifiers {:peace 1}}
              {:title "Chinkis Mor the Elf Warlord, who grew his forests across our plowlands." :modifiers {:wealth 1}}
              {:title "Ves Venna son of Valind, who fought his own kin without honor." :modifiers {:peace 1}}
              {:title "Jagrekriand the Red God, who broke Umath and hated Orlanth's people. " :modifiers {:magic 1}}
              {:title "Tada the Green, Lord of Prax " :modifiers {:morale 1}}
              {:title "Zzabur the Atheist, who tried to kill Orlanth with sorcery. " :modifiers {:magic 1}}
              {:title "Narga the Bad Dog, who hated Yinkin and the Vingkotlings. " :modifiers {:magic 1} :special "Your clan descents from Yinkin."}
              {:title "Deloradella, Queen of the Dark Tribe, the hungry eaters that ate everything in the wilds." :modifiers {:war 1}}]};; TODO disable in 14
   {:title "10. The Great Darkness"
    :query "Which disaster nearly exterminated your folk?"
    :description "Eventually, the Great Darkness descended on Glorantha. Many gods died, others slept, and even Orlanth abandoned his people to try to save the world. Everything in the universe seemed hostile, and was at least uncaring. You saw many die and many strangers joined the surviving clans. The adoption rites were made at this time, and used extensively so that everyone could survive."
    :options [{:title "When the sun fell from the sky." :modifiers {}}
              {:title "When the sky rained burning blood." :modifiers {}}
              {:title "When the plants became carnivorous." :modifiers {}}
              {:title "The Great Fire." :modifiers {}}
              {:title "The Laughing Waves." :modifiers {}}
              {:title "The New Volcanoes (the Vent and Black Glass)." :modifiers {}}
              {:title "The Chaos Gods." :modifiers {}}
              {:title "When the sky fell down." :modifiers {}}
              {:title "When the oceans burned away." :modifiers {}}
              {:title "When there was no food." :modifiers {}}
              {:title "When there was no air." :modifiers {}}
              {:title "When there was no love." :modifiers {}}
              {:title "When there was no fear." :modifiers {}}
              {:title "On the Plain of Salt." :modifiers {}}
              {:title "In the Great Winter Without End." :modifiers {}}]
    :input {:title "Your clan  knows a specific myth regarding how it was nearly exterminated in the Darkness and how it managed to survive. Give your clan wyter a magical ability relating to this event." :meaning :wyter_ability}}
   {:title "11. The Chaos Wars"
    :query "What was your clan's specific Chaos Foe?"
    :description "At last, only monsters, demons, formless Chaos, and their victims remained. Many were so terrible that nothing could withstand them. Clans, tribes, kingdoms, and nations disappeared in the terrible time. Some things could be resisted with fire, magic, and spear, and all peoples alive today descend from someone who survived that time. A particular foe pursued your ancestors; although you do not know why, you are still plagued by that form of Chaos."
    :options [{:title "Broos." :modifiers {}}
              {:title "Dragons." :modifiers {}}
              {:title "False Friends." :modifiers {}}
              {:title "The Hydra." :modifiers {}}
              {:title "Ogres." :modifiers {}}
              {:title "Scorpion-men." :modifiers {}}
              {:title "The Thing with Many Bodies." :modifiers {}}]
        :input {:title "Give your clan wyter both an ability to fight the Chaos Foe you chose and a flaw that it is plagued by that form of chaos." :meaning :wyter_ability}}
   {:title "12. The Die Off"
    :query "How did your clan survive the Great Darkness?"
    :description "Even mighty Orlanth and his companions eventually abandoned all humans to their fate. Only a few deities, small ones or weak ones, remained. The world died. Even the greatest of the gods were locked into static lifelessness or were out of control as a destructive force. Only a handful of minor or diminished deities struggled on, helping and being helped by their human accomplices. Everyone who survived the Great Darkness did so because of a survival secret they learned. Most were saved by a Living God, who protected them until Orlanth and Ernalda eventually returned."
    :options [{:title "We hid inside Brastalos, the No Wind, so the monsters could not find us." :modifiers {:magic 1}}
              {:title "We strapped the bones of our dead fathers on our feet, and escaped from the monsters by skating on the ice." :modifiers {:morale 1}}
              {:title "We dug a hole in the ground and huddled inside, kept alive by the warmth of our sleeping kinsmen." :modifiers {:wealth 1}}
              {:title "A star captain fell screaming from the sky, and his light led us safely through the Darkness." :modifiers {:magic 1}}]}
      ;; TODO  13. I Fought We Won
   {:title "14. The Unity Council"
    :query "Which allies were most important to you?"
    :description "King Heort guided your people out of the Great Darkness. He reinstituted sacrifice to the gods, organized the peoples into clans, gave out the new laws for society, and arranged the first new tribe. In his honor, you became Heortlings. He also arranged alliances with all the nearby Elder Races and formed the Unity Council. For the first time ever, humans and the elder races worked cooperatively. During this time of peace and cooperation, your ancestors made many unexpected allies."
    :notes "The Unity Council of Dragon Pass was a unique and extraordinary phenomenon. Many ancient feuds and hostilities were set aside for the sake of harmony. The unity allowed the peoples to cast off Chaos and to thrive in comparison with the rest of the miserable Darkness-plagued world.\n\n You cannot choose the same answer as you did for your Ancient Enemy. Your hostility to that enemy blinded you to the advantages of the new age."
    :options [{:title "The elves, who taught you to call them Aldryami." :modifiers {:peace 1} :disabled_by [9 3] :special "Your clan knows a ritual to peacefully interact with the Aldryami."}
              {:title "The Mostali, whom you had previously called dwarves." :modifiers {:wealth 1} :disabled_by [9 2] :special "Your clan knows a ritual to peacefully interact with the Mostali."}
              {:title "The trolls, who now wanted you to call them Uz." :modifiers {:morale 1} :disabled_by [9 9] :special "Your clan knows a ritual to peacefully interact with the Uz."}
              {:title "The nomads of Prax, who had always raided our lands, but who shared common deities and hatred of Chaos." :modifiers {:war 1} :disabled_by [9 6] :special "Your clan knows a ritual to peacefully interact with the Praxian nomads."}
              {:title "The dragonewts, who served the monstrous dragons in their unfathomable and alien ways, but feared Chaos as did you." :modifiers {:magic 1} :disabled_by [9 1] :special "Your clan knows a ritual to peacefully interact with the dragonewts."}]}
   {:title "15. The Heortlings"
    :query "Which Heortling Tribe did your clan belong to?"
    :description "Under King Heort's leadership the clans prospered and soon his Heortling Tribe became many tribes. There are eleven ancestral Heortling Tribes. Everyone knows which one they belonged to during the Dawn Age, even though none of them exists any longer." ;; TODO wyter ability
    :options [{:title "We belonged to the Vestantes, the tribe of one of the Summer Daughters Vestene and her foreigner husband Goralf Brown. We lived in the north, in the lands now called Aggar." :modifiers {} :explanation "We belonged to one of the ancient Vingkotling tribes founded by the children of King Vingkot but adopted the ways of Heort:"}
              {:title "We belonged to the Koroltes, the tribe of the Summer Son, Korol. We lived near Kero Fin in the lands later stolen by the Grazelanders." :modifiers {:war 1 :magic 1} :special "Your ancestral heroes are Vestene Summer and Goralf Brown. Your clan dislikes Grazelanders, who stole youor ancestral lands in the Third Age."}
              {:title "We belonged to the Ogorvaltes, the tribe of one of the Summer Daughters, Orgorvale and her outlander husband Ulanin the Rider. We lived in the lands now called Sartar." :modifiers {:peace 1} :special "Yur ancestral heroes are Ogorvale Summer and Ulanin the Rider. Your clan knows how to **Ride Horses** as a clan ability."}
              {:title "We belonged to the Penentelli, the tribe of the Winter Daughter, Penene, and her husband Kastwall Five. We lived in the highlands of the lands now called Aggar." :modifiers {:war 1} :special "Your ancestral heroes are Penene Winter and Kastwall Five. Your clan knows how to **Hunt** as a clan ability."}
              {:title "We belonged to the Infithtelli, the tribe of one of the Summer Daughters, Infithe and her husband Porscriptor the Cannibal. We lived in the land now called Tarsh." :modifiers {:truth 1 :peace 1} :special "Your ancestral heroes are Infithe Summer and Proscriptor the Cannibal. Your clan has the ability to make a **Terrifying Shout** as a clan ability."}
              {:title "We belonged to Berenethtelli, the tribe of the Red-Haired Winter Daughter Redaylde and her horse-loving husband Bereneth the Rider. We lived in the north, in the land now called Saird." :modifiers {:movement 1 :war 1} :special "Your ancestral heroes are Bereneth the Rider and Red-Haired Redaylde. You clan has **Horsemanship** as a clan ability and **Hates Dara Happans**, an ancient foe in the Darkness."}
              {:title "We joined the Liornvuli, named for Liorn the Young, star husband of Deleen daughter of King Kodig, the eldest son of Vingkot. We lived in the land now called Tarsh." :modifiers {:magic 1} :special "Your ancestral hero is Liorn the Young. Your clan wyter has the ability to **Summon a Shooting Star**." :explanation "We joined one of the tribes that were formed out of the remains of those destroyed during the Gods War. We followed a great hero who came down from the heavens and who provided us with flickering light during the Darkness:"}
              {:title "We joined the Forosilvuli, named for Forosil Ferocious, star husband of Ornore Korolsdottir. We lived in the land now called Tarsh." :modifiers {:wealth 1} :special "Your ancestral hero is Foronsil Ferocious. Your clan wyter has the ability to **Bless Cattle**."}
              {:title "We joined the Stravuli, named for Stravul, the great hero who defended Dragon Pass in the Darkness. We lived in the lands now called Tarsh." :modifiers {:magic 1} :special "Your ancestral hero is Stravul the Mighty. Your wyter has the ability to **Know Enemy's Weakness.**"}
              {:title "We joined the Garanvuli, named for Garan, star lover of Serias, who defeated the Chaos Army and saved his lover at Whitewall. We lived in the lands now called Heortland." :modifiers {:war 1} :special "Your ancestral heroes are Garan the Low Star and Serias. Your wyter has the ability to **Fight Agains Chaos**."}
              {:title "We joined the Sedenorvuli, named for Sedenor who descended to save his clan from Chaos. We lived in the land just north of the Shadow Plateau and feuded with the Koroltes until we were forced to move to the far north to a land now called Talastar." :modifiers {:morale 1} :special "Your ancestral hero is Sedenor. Your wyter has the ability to **Fight Against Chaos**."}]
    }
   {:title "16. The Era of Time"
    :query "What deity did your clan help awaken?"
    :description "While the rest of society worked to protect, feed, and just survive, the First Priests worked to re-establish links with the ancient deities. A new harmony between people and deities was made and the world was slowly improved. The gods returned from the Underworld with the First Dawn. Time and history began."
    ;; TODO tag question to avoid repeating (shrine, ancestor)
    :options [{:title "Our ancestors, we did not need more." :modifiers {:man 1} :special "Your clan has a strong connection and a shrine to our ancestors." :explanation "None."}
              {:title "Ernalda, the Mother Goddess." :modifiers {:earth 1} :special "Your clan has a strong connection and a shrine to Ernalda, the Mother Goddess." :explanation "We woke:"}
              {:title "Orlanth, the Allfather." :modifiers {:air 1} :special "Your clan has a strong connection and a shrine to Orlanth, the Allfather."}
              {:title "Lhankor Mhy, the Knowing God." :modifiers {:truth 1} :special "Your clan has a strong connection and a shrine to Lhankor Mhy, the Knowing God."}
              {:title "Issaries, the Talking God." :modifiers {:communication 1} :special "Your clan has a strong connection and a shrine to Issaries, the Talking God."}
              {:title "Chalana Arroy, the Healing Goddess." :modifiers {:harmony 1} :special "Your clan has a strong connection and a shrine to Chalana Arroy, the Healing Goddess."}
              {:title "Heler, the Rain-bringing God." :modifiers {:water 1} :special "Your clan has a strong connection and a shrine to Heler, the Rain-bringing God."}
              {:title "Elmal, the Suffering Sun." :modifiers {:fire 1} :special "Your clan has a strong connection and a shrine to Elmal, the Suffering Sun." :explanation "None. We retained worship of the Living Deity, who is:"}
              {:title "Kolat, the Spirit Wind." :modifiers {:spirit 1} :special "Your clan has a strong connection and a shrine to Kolat, the Spirit Wind."}
              {:title "Storm Bull, the Mindless Storm." :modifiers {:eternal_battle 1} :special "Your clan has a strong connection and a shrine to Storm Bull, the Mindless Storm."}
              {:title "Humakt, the Lord of Death." :modifiers {:death 1} :special "Your clan has a strong connection and a shrine to Humakt, the Lord of Death."}
              {:title "Yinkin, the Alynx God." :modifiers {:yinkin 1} :special "Your clan has a strong connection and a shrine to Yinkin, the Alynx God."}
              {:title "Lady of the Wild." :modifiers {:beast 1} :special "Your clan has a strong connection and a shrine to Lady of the Wild."}
              {:title "Odayla, the Hunting God." :modifiers {:beast 1} :special "Your clan has a strong connection and a shrine to Odayla, the Hunting God."}
              {:title "Argan Argar, the Speaker in Darkness." :modifiers {:darkness 1} :special "Your clan has a strong connection and a shrine to Argan Argar, the Speaker in Darkness."}]}
   {:title "17. Lokamayadon"
    :query "How did your clan resist Lokamayadon?"
    :description "Orlanth always encouraged personal ambition. No one thought there could be too much personal advancement until a priest named Lokamayadon took upon himself the powers of High Storm. He tried to replace Orlanth, peacefully at first and then by killing all who worshipped the God.\n\n Many people went along with him because he was powerful, but most Orlanthi resisted, though it cost them greatly. Now everyone hates \"Lokomoko,\" who was revealed as a Chaos god."
    :options [{:title "Fought ceaselessly, no matter how many of us were killed." :modifiers {:war 1 :courage 1 :rebellious 1}}
              {:title "Fought the High Storm people when it was safe to do so." :modifiers {:morale 1 :cautious 1 :rebellious 1}}
              {:title "Pretended to go along with High Storm, and waited for a good time to rebel." :modifiers {:wealth 1 :shrewd 1}}
              {:title "We could not help ourselves; we were forced to follow him." :modifiers {:peace 1}}
              {:title "We followed Lokomo because we did not know it was wrong." :modifiers {:magic 1 :ambitious 1}}]}
   {:title "18. Arkat the Liberator"
    :query "18.1 What did your clan do when Arkat came?"
    :description "Lokamayadon helped create a new god called Gbaji, which brought Chaos back. It would have destroyed the world except that the great hero Harmast Barefoot performed the Lightbringers Quest and brought back the destroyer of Gbaji."
    :options [{:title "Raised all our forces to fight." :modifiers {:war 1 :rebellious 1 :courage 1}}
              {:title "Sent as many men as we could spare, but no more." :modifiers {:morale 1 :courage 1 :shrewd 1}}
              {:title "Waited to see what would happen, then helped when we were sure he would win." :modifiers {:wealth 1 :ambitious 1}}
              {:title "Neither helped nor hindered." :modifiers {:peace 1 :cautious 1}}]}
   {:title "18. Arkat the Traitor"
    :query "18.2 How do you feel about Arkat's betrayal?"
    :description "Arkat was the destroyer. He was a man who had lived before, a sorcerous demon in the shape of a man, or maybe just a trickster. Arkat helped everyone, then betrayed them. He deserted his army when it fought Dara Happa and he finally even left Harmast in the clutches of his worst foe, so that he could betray the whole human race and become a troll. Everyone hates Arkat, even though he destroyed Gbaji and saved the world. It does not matter what fate your clan suffered at his hands, they suffered, but survived, and that is all anyone needs to remember."
    :options [{:title "Our honor was terribly offended and we demanded vengeance." :modifiers {}}
              {:title "Offended, but we still worked with him against Gbaji." :modifiers {}}
              {:title "We did not care, he is still a hero." :modifiers {}}
              {:title "He did not become a troll, not Arkat!" :modifiers {}}
              {:title "Our clan has little interest in Arkat one way or another." :modifiers {}}]}
   {:title "19. The Empire of Wyrms Friends"
    :query "What was your attitude towards the dragons?"
    :description "During the Second Age, a dragon approached you, in either its own form or that of a human with the soul of a dragon. The dragons had always been hostile, or at the very best utterly uncaring, but now it offered to share knowledge with you. Orlanth has always been the dragon-slayer, but many priests of other clans embraced these new ways and formed the EWF, the Empire of Wyrms Friends. Your clan did not, or you would not be here now."
    :options [{:title "Hostile, we fought against them." :modifiers {}}
              {:title "Negative, we resisted them, for we would never believe a dragon." :modifiers {}}
              {:title "Suspicious, we did not go along." :modifiers {}}]}
   {:title "20. The Dragonkill War"
    :query "What lesson did your clan draw from the Dragonkill?"
    :description "The EWF was corrupted by the dragons and finally destroyed when the dragonewts killed its leaders.\n\n Afterwards, several great armies invaded Dragon Pass from the north, east, and south. After decades of warfare, hundreds of dragons (including the great dragons) appeared, some as big as the sky, and ate every human being they found, hostile or otherwise. A few incredibly lucky people survived, said to number only ten humans. Any hatred people had for the dragons was replaced by unconquerable fear."
    :options [{:title "Never try things that go against Orlanth's way." :modifiers {}}
              {:title "Kings should rule, because priests make errors when they try to lead people." :modifiers {}}
              {:title "New things are usually bad." :modifiers {}}
              {:title "Knowledge itself is not harmful, only the way it is used." :modifiers {}}
              {:title "Be careful when making friends." :modifiers {}}
              {:title "Dragons are evil." :modifiers {}}
              {:title "It was lucky that we lived in Heortland at the time." :modifiers {}}]}
   {:title "21. The Third Age"
    :query "21.1 Why did you leave your homeland?"
    :description "At some point, the actions of ancestors are less \"something that they did\" and more \"something that we did.\" That point comes now.\n\n After the Dragonkill, your ancestors lived in Heortland. The Hendrikings ruled Heortland from the great fortress of Whitewall, themselves allies of Ezkankekko the Only Old One, a Darkness demigod who lived in a huge volcanic palace on the Shadow Plateau. Ezkankekko ruled with justice and indifference, collected tribute, and kept the peace.\n\n One day, 193 years after the Dragonkill (1313 S.T.), a man swam ashore and caused trouble in the land of Kethaela. Over the next five years he fomented war and rebellion against Ezkankekko, rightful ruler since the Dawn of time. He made enemies, found new friends, woke Silver Age heroes, and finally overthrew the rulers and deities of the Shadowlands (1318 ST). Their conflict released cosmic powers, and the Obsidian Castle shattered, covering the verdant plateau with black dust. The usurper killed Ezkankekko, and thereafter called himself the God-King.\n\n This God-King went throughout Kethaela and established his rule. When he came to the kingdom of the Hendrikings in Heortland, he used deceitful magic to overcome the Hendrikings. He destroyed the ancient Hendriking tribe and Heortland became part of his own kingdom. Whoever could not change got their people together and moved.\n\n By the time the God-King came to Heortland and started a civil war, you heard that the lands to the north (in forbidden Dragon Pass) were now open to humans. The movement of clans there is called the Resettlement. Your clan was one of these clans."
    :options [{:title "We hated the God-King." :modifiers {}}
              {:title "Some of us hated the God-King, but others liked him, so our clan split to avoid kinstrife." :modifiers {}}
              {:title "We loved the God-King, and wished to make Dragon Pass part of his rule." :modifiers {}}
              {:title "We wanted a dangerous new life." :modifiers {}}
              {:title "We were poor and wanted to be rich." :modifiers {}}
              {:title "It was a new place to explore." :modifiers {}}]}
   {:title "21. The Third Age"
    :query "21.2 What sort of lands did you settle?"
    :description "You settled in the best lands you could find and hold and farmed and raised livestock as was appropriate for those lands."
    :options [{:title "Hills and Highlands, good for herding sheep and defending against foes." :modifiers {}}
              {:title "River Bottoms, good for intensive farming." :modifiers {}}
              {:title "Flatlands, good for raising cattle and farming." :modifiers {}}
              {:title "Wildlands, only good for hunting" :modifiers {}}]}
   {:title "22. New Enemies"
    :query "Which of these people most resisted your arrival?"
    :description "The Haunted Lands of Dragon Pass were not unoccupied. The Elder Races had thrived here away from humans as had remnants of peoples forgotten elsewhere. The Elder Races and their allies resisted our resettlement of our ancient lands."
    :tag :new-enemy
    :options [{:title "The Aldryami, who fought you when you cut down their woods." :modifiers {}}
              {:title "The Beastmen, who said the all the land was theirs." :modifiers {}}
              {:title "The Tusk Riders, who wanted to sacrifice you to their gods." :modifiers {}}
              {:title "The Grazers,who objected to you fencing in their lands." :modifiers {}}
              {:title "The Mostali, who claimed you ruined their schedule." :modifiers {}}
              {:title "The Praxians of the Prax desert, who tried to rob you." :modifiers {}}
              {:title "The Undead of the Upland Marsh, who hate the living." :modifiers {}}
              {:title "The Uz, who thought you would be good to eat." :modifiers {}}]}
   {:title "23. The New Tribes"
    :query "Which tribe and confederation did your clan join?"
    :description "As clans settled, they began to fight one another. Some were conquered, some received tribute from dozens of others, and some formed alliances. These were the early tribes. Look at the tribal map on page 222 [of Sartar, Kingdom of Heroes] and pick the tribe your clan joined. Try to pick a tribe with territory like that you chose in Question 21."
    :options [{:title "Aranwyth, the Cloud Tribe" :modifiers {}}
              {:title "Balkoth Tribe, the Goatsuckers" :modifiers {}}
              {:title "Balmyr Tribe, the Poets" :modifiers {}}
              {:title "Cinsina Tribe, the Wolfslayers" :modifiers {}}
              {:title "Colymar Tribe, the Proud" :modifiers {}}
              {:title "Culbrea Tribe, the Foremost" :modifiers {}}
              {:title "Dinacoli, the Wealthy Tribe" :modifiers {}}
              {:title "Dundealos Tribe, the Jaldonkillers" :modifiers {}}
              {:title "Kheldon Tribe, the Most Noble"  :modifiers {}}
              {:title "Locaem Tribe, the Spears" :modifiers {}}
              {:title "Lismelder Tribe, the Most-Clever" :modifiers {}}
              {:title "Malani, the Swords" :modifiers {}}
              {:title "Pol Joni, the Bastards" :modifiers {}}
              {:title "Sambarri, the Thrallholders" :modifiers {}}
              {:title "Torkani, the Troll Lovers" :modifiers {}}]}
   {:title "24. King Sartar"
    :query "Which of Sartar's deeds do you most admire?"
    :description "About a hundred and fifty years ago, a man named Sartar came to your land of warring tribes. His ways were new and strange, but his magic was powerful. He made this place into the kingdom that now bears his name."
    :options [{:title "He performed many miracles, and never lifted weapons against his foes." :modifiers {}}
              {:title "He made peace with the wolf beast Telmori." :modifiers {}}
              {:title "He united the tribal kings." :modifiers {}}
              {:title "He built cities and roads." :modifiers {}}
              {:title "He sponsored temples and libraries." :modifiers {}}
              {:title "He married the Feathered Horse Queen and became King of Dragon Pass." :modifiers {}}
              {:title "He immolated himself in a bolt of lightning and rose into the sky, leaving behind the Flame of Sartar." :modifiers {}}]}
   {:title "25. The Lunar War"
    :query "How did you react when the Lunar missionaries came to your clan?"
    :description "Recent times include everything within the memory of people now in the clan. These events are part of living memory, not ceremonial memory.\n\n #### Lunar Missionaries\n\nHigh King Sartar exchanged ambassadors with the King of Tarsh to promote peace and trade. Men and women in red robes came after his apotheosis, and for the first time people in Sartar learned about the Lunar Goddess. The Red Moon had risen in 1247, a bad omen that surprised and frightened the Heortlings. Everyone became uncomfortable when they learned that the red missionaries worshipped the red thing in the sky, for all the Sartarite prophecies warned that the Red Moon was a foe. Nonetheless, the Red Goddess' missionaries came through Sartar, seeking converts to her way.
         "
    :options [{:title "We killed them." :modifiers {}}
              {:title "We took them as thralls." :modifiers {}}
              {:title "We drove them off, or at least refused to let them enter our steads." :modifiers {}}
              {:title "We gave them hospitality." :modifiers {}}
              {:title "We welcomed them, and listened to their interesting new doctrines." :modifiers {}}]}
   {:title "26. Tarkalor's War"
    :query "How did your clan participate in this war?"
    :description "The Lunar Empire conquered Tarsh many years ago. They tried to conquer Sartar as well. The great High King Tarkalor led everyone to years of victory, until his terrible defeat of Grizzly Peak."
    :options [{:title "We gave no quarter, and expected none." :modifiers {}}
              {:title "We fought honorably, but not insanely." :modifiers {}}
              {:title "We sent as few warriors as we could get away with." :modifiers {}}
              {:title "We argued for peace." :modifiers {}}
              {:title "We would not fight our Lunar friends." :modifiers {}}
              {:title "We were paid to ally with the Lunars, and fought our neighbors." :modifiers {}}]}
   {:title "27. Defeat and Occupation"
    :query "How did your clan react to the Lunar overlords?"
    :description "16 years ago, the Lunars won the war and occupied Sartar. They closed down the city temples of Orlanth, levied taxes, and enslaved those they deemed criminals or rebels. They imposed many laws that were impossible to obey, just so they had excuses to tax the clans and arrest anyone."
    :options [{:title "Many of our people abandoned their land and took to the hills as rebels." :modifiers {}}
              {:title "We spat in their faces." :modifiers {}}
              {:title "We chose to bide our time until a good day for rebellion came." :modifiers {}}
              {:title "We accepted their rule, but did not love them." :modifiers {}}
              {:title "We pledged our loyalty to them." :modifiers {}}]}
   {:title "28. Infighting"
    :query "What was your role in this infighting?"
    :description "With no Orlanthi king on the throne of Sartar, many of your countrymen took advantage of the opportunity to settle old grudges or steal land from neighbors. The tribes fell to fighting with one another. Clans from several tribes attacked the Telmori Tribe of wolf-men, for example. The Imperial troops mostly kept to their cities and roads."
    :options [{:title "Our chieftain settled disputes, giving away cattle when necessary. We earned the respect of the other clans and tribes, but at great cost." :modifiers {}}
              {:title "We argued that the mere absence of a king should not suspend Heort's laws." :modifiers {}}
              {:title "We struck against those who had offended us in the past." :modifiers {}}
              {:title "We lamented this dishonorable violence." :modifiers {}}
              {:title "We attacked the Telmori, a werewolf race that has never worshipped our gods. To those who lent aid, cattle were given and Lunar taxes lifted." :modifiers {}}
              {:title "We fought to expand our clan boundaries, at the expense of weak neighbors. " :modifiers {}}
              {:title "We tended to our crops, and everyone else was too busy fighting each other to bother us." :modifiers {}}]}
   {:title "29. Starbrow's Rebellion"
    :query "What did you do when Kallyr's emissaries came to you?"
    :description "Five years ago, many clan chieftains and tribal kings, led by the Kheldon Queen, Kallyr Starbrow, took part in an uprising against the Lunars. Perhaps your chieftain knew, from experience in previous wars, what might occur here."
    :options [{:title "We sent all our warriors to fight." :modifiers {}}
              {:title "We sent some warriors to fight." :modifiers {}}
              {:title "Some warriors fought even though we forbade them to." :modifiers {}}
              {:title "We said it was not the time for rebellion." :modifiers {}}
              {:title "We did not help, and afterwards criticized Kallyr for her reckless actions, which caused so much harm." :modifiers {}}
              {:title "We warned the Lunars of Kallyr's plans, to avoid reprisals." :modifiers {}}]}
   {:title "30. Prince Temertain"
    :query "What does your clan think of Prince Temertain?"
    :description "When the Lunars conquered Sartar, they sent assassins, demons, and gods to kill all heirs of the House of Sartar. However, during Starbrow's Rebellion an heir was found in the south, a scholar named Temertain. He claims to be the \"Philosopher King\". His dynastic blood was proven, but he could not light the Flame of Sartar that the Lunars extinguished in 1602. So far, his philosophy seems to primarily involve close collaboration with the Lunars. However, even Lunar supporters know that he is weak, just a Lunar puppet."
    :options [{:title "We hate him, but there is nothing to be done." :modifiers {}}
              {:title "We dislike him, but he could be worse." :modifiers {}}
              {:title "We think he is an idiot, but tolerable." :modifiers {}}]}
   {:title "31. The Duck Hunt"
    :query "Did your clan participate in the Duck Hunt?"
    :description "The Lunars blamed Starbrow's Rebellion on the durulz or ducks, one of the beastpeople who had been loyal to Sartar. A proclamation was made that any Sartarite who delivered the body of a durulz, dead or alive, would be relieved of one year of the heavy tribute imposed by the Lunars. "
    :options [{:title "Yes." :modifiers {}}
              {:title "No." :modifiers {}}]}])

(defn filtered-questions [context args value]
  (let [{:keys [titleLike]} args]
    (filter #(or (nil? titleLike) (.contains (:title %) titleLike)) questions)))
