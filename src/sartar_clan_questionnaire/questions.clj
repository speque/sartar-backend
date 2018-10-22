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
    :options [
              {:title "We did the Flax Dance. The people danced until the flax fell apart. They were tired, and while they rested, Ernalda taught them how to make the flax into fibers." :modifiers {:earth 2 :life 2 :peace 1}}
              {:title "We did the Goose Dance. The people danced until the goose fell apart. They were tired again and, while they rested, Ernalda showed them how to prepare all the parts of a goose: which parts made tools, costumes, and charms; and how to make it into portions." :modifiers {:earth 1 :harmony 1 :morale 1}}
              {:title "We did the Sacrifice Dance. The people danced until the crowd fell apart. They were tired again, and while they rested Ernalda showed some of them how to burn one portion of the goose to appease the messenger with the stick, and others how to cook the rest of the goose into food." :modifiers {:earth 2 :magic 1}}
              {:title "We did not dance, but instead made the vessels in which the flax and geese were sacrificed." :modifiers {:wealth 1 :earth 2}}
    ]}
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
    :description "Death was the first thing that set people apart from the gods. Grandfather Life was the first to be killed with Death and afterwards was called Grandfather Mortal. Because of that, all of his descendents have been set apart from the gods, even after death came to the gods as well.\n Umath was destroyed by the Emperor's bloody lieutenant, the Red God Jagrekriand, which set off the horrible time called The Gods War. In that turbulent era, the parts of the world fought itself; gods grappled, and threw landmarks at each other. The Old Gods of the Celestial Court were destroyed and shattered.\n  Amid the destruction, the mortal peoples adapted to survive or died off. Different peoples had different ways to cope. Umath's youngest and wisest son, Orlanth, was initially one of the many upstart, rebellious deities bent upon conquest of the world. Orlanth's unique contributions at the time were his honor and his kinship to the deities of Air. Where the Bright Emperor sought to control people through fear, force, and hollow laws, Orlanth gathered his people by force of virtue, character, and example."
    :options [
              {:title "You knew that he would be great right from the start." :modifiers {:air 3} :special "+3 when calling Orlanth for divination"}
              {:title "You met him when he was young and explored the world below the Great Mountain." :modifiers {:air 2 :movement 1}}
              {:title "He challenged the Bright Emperor to Contests of Dancing, Magic, and Music, and then killed the Emperor with his new weapon, Death. " :modifiers {:air 3 :movement 2}}
              {:title "He found the new weapon called Death, and used it to kill the Evil Emperor at the Battle of Extinguish Field. " :modifiers {:air 3 :death 1}}
              {:title "He wooed Ernalda, won her heart, and created the Marriage Ring. " :modifiers {:air 1 :harmony 1}}
    ]}
   {:title "6. Your Earliest Famous Event "
    :query "Your earliest Famous Event was:"
    :description "You fought in the many wars that Orlanth undertook to conquer the world. These wars helped shape the world. Other more peaceful deeds shaped the world as well."
    :options [
              {:title "Battle of the Trembling Shore. Where Orlanth and his army raged against the salty gods of the sea, and drove them like froth in a storm." :modifiers {:air 1 :morale 1}}
              {:title "Battle of Extinguish Field. Orlanth met Yelm face to face in open battle, and Orlanth killed Yelm and scattered his army." :modifiers {:air 1 :war 1}}
              {:title "The Thrinbarri Battles. Where Orlanth and his army fought against the sky warriors." :modifiers {:air 1 :wealth 1}}
              {:title "The First Dragonslaying. Where Orlanth killed Sh'harkazeel the Mover of Heavens and took his Dragon Power." :modifiers {:air 1 :magic 1}}
              {:title "The Plundering of Aron. Where Orlanth and his army defeated Seravus the Enchanter and recaptured the Beasts." :modifiers {:air 1 :war 1}}
              {:title "Onetree Exchange. Where Issaries showed Orlanth how to honorably challenge and exchange secrets with Genert." :modifiers {:peace 1 :communication 1}} ;; TODO check this
              {:title "Roitina's Purification. Where Roitina showed mortals how to live in harmony with the gods." :modifiers {:earth 1 :magic 1}}
              {:title "The Ox-Taming. When Barntar tamed the Bull and harnessed oxen to the plow." :modifiers {:earth 1 :wealth 1}}
              {:title "The Fate-Weaving. When Ernalda first revealed the Tapestry of Destiny and the fate of the gods." :modifiers {:earth 1 :magic 1}}
              {:title "The Pot-Making. When Pella the Pottery Goddess first made a pot to store grain in." :modifiers {:earth 1 :wealth 1}}
              {:title "The First Fire Day. When Ernalda tamed the Lowfires and put them to work for the women. " :modifiers {:earth 1 :peace 1}}
    ]}
  {:title "7. Marriage of Orlanth and Ernalda "
     :query "Which side did your ancestors stand on?"
     :description "Orlanth wooed the forces of Earth and after many tribulations, adventures, and discoveries the storm god proved himself worthy of marrying Great Ernalda, the Earth Queen. The two of them created the Marriage Oath and thereby established a great harmony in the world through this sacred bonding.\n You, a loyal member of Orlanth's army, were there at the wedding. When you went into the ceremony, you were asked which side you wished to stand on: the right (Air) or left (Earth) side."
     :options [{:title "Air" :modifiers {}}
               {:title "Earth" :modifiers {}}
               {:title "We guarded the sacred circle" :modifiers {} }]}
   {:title "8. The Vingkotling Age"
    :query "Which remnant people joined you?"
    :description "Vingkot was a son of Orlanth and the first great king of the Orlanthi people. The Vingkotlings were great, with full baskets and fat herds and always victorious over their foes. The people set up many altars where the gods lived and so established the relations of worship. King Vingkot led and sent many expeditions against the enemies who wanted to take it away. Vingkot is still worshipped for the great deeds he did, and for his leadership of the gods when Orlanth went away.\n Vingkot married the Summer and Winter Wives and with them he had five sons and five daughters. The bloodline of Vingkot was unique and was necessary to be a king. Each son and daughter founded a Vingkotling tribe, except for the Second Son, who traveled to the edge of the world. Vingkot chose his eldest son Kodig to be the high king of all the Vingkotlings and his son's bloodline, called the Kodigvari, were the Royal Tribe of the Vingkotlings.\n When the world fell apart, Vingkot welcomed refugees and reorganized the devastated clans, so that all might survive. He asked you to shelter the people of a ruined clan, but let you choose what status to give them."
    :options [
      {:title "Buf Gart, the \"Hungry Women\"." :modifiers {}}
      {:title "Ched Durkel, the \"Strings\"." :modifiers {}}
      {:title "Jars Antanggi, the \"People of the Shadows\"." :modifiers {}}
      {:title "Karantuel, the \"Cloud Folk\"."  :modifiers {}}
      {:title "Korsto Viv, the \"People of the Rivers\"." :modifiers {}}
      {:title "Nalda Bin, the \"Stick Farmers\"." :modifiers {}}
      {:title "Aranto Viv, the \"Axe People\"." :modifiers {}}
      {:title "Eryain Ins, \"The Blondes\"." :modifiers {}}
      {:title "Forosto Jann, the \"Deadly Archers\"." :modifiers {}}
    ]};; TODO subquestion: What status did you give the refugees?
    {:title "9. Ancient Enemies "
     :query "Who is your clan's Ancient Enemy?"
     :description "The foes of the Vingkotlings were many. As time went on, you found yourself fighting against the same foes over and over again. One enemy in particular plagued your people consistently during the era. Your ancestors fought these foes so often that they developed special magic to combat them.\n Even today, your clan does not get along with the descendants of the Ancient Enemy, and your wyter is especially effective against them."
     :tag :ancient-enemy
     :options [
      {:title "Venebain the Lightfore, leader of the Fire Tribe, heirs to the Evil Empire." :modifiers {}}
      {:title "The Dragonewts, the dire dragon people." :modifiers {}}
      {:title "Mostali and the Stone Tribe, made up of the change-hating dwarves." :modifiers {}}
      {:title "Chinkis Mor the Elf Warlord, who grew his forests across our plowlands." :modifiers {}}
      {:title "Ves Venna son of Valind, who fought his own kin without honor." :modifiers {}}
      {:title "Jagrekriand the Red God, who broke Umath and hated Orlanth's people. " :modifiers {}}
      {:title "Tada the Green, Lord of Prax " :modifiers {}}
      {:title "Zzabur the Atheist, who tried to kill Orlanth with sorcery. " :modifiers {}}
      {:title "Narga the Bad Dog, who hated Yinkin and the Vingkotlings. " :modifiers {}}
      {:title "Deloradella, Queen of the Dark Tribe, the hungry eaters that ate everything in the wilds." :modifiers {}}
     ]}
   {:title "10. The Great Darkness"
    :query "Which disaster nearly exterminated your folk?"
    :description "Eventually, the Great Darkness descended on Glorantha. Many gods died, others slept, and even Orlanth abandoned his people to try to save the world. Everything in the universe seemed hostile, and was at least uncaring. You saw many die and many strangers joined the surviving clans. The adoption rites were made at this time, and used extensively so that everyone could survive."
    :options [
      {:title "When the sun fell from the sky." :modifiers {}}
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
      {:title "In the Great Winter Without End." :modifiers {}}
    ]}
    {:title "11. The Chaos Wars"
     :query "What was your clan's specific Chaos Foe?"
     :description "At last, only monsters, demons, formless Chaos, and their victims remained. Many were so terrible that nothing could withstand them. Clans, tribes, kingdoms, and nations disappeared in the terrible time. Some things could be resisted with fire, magic, and spear, and all peoples alive today descend from someone who survived that time. A particular foe pursued your ancestors; although you do not know why, you are still plagued by that form of Chaos."
     :options [
      {:title "Broos." :modifiers {}}
      {:title "Dragons." :modifiers {}}
      {:title "False Friends." :modifiers {}}
      {:title "The Hydra." :modifiers {}}
      {:title "Ogres." :modifiers {}}
      {:title "Scorpion-men." :modifiers {}}
      {:title "The Thing with Many Bodies." :modifiers {}}
     ]}
     {:title "12. The Die Off"
      :query "How did your clan survive the Great Darkness?"
      :description "Even mighty Orlanth and his companions eventually abandoned all humans to their fate. Only a few deities, small ones or weak ones, remained. The world died. Even the greatest of the gods were locked into static lifelessness or were out of control as a destructive force. Only a handful of minor or diminished deities struggled on, helping and being helped by their human accomplices. Everyone who survived the Great Darkness did so because of a survival secret they learned. Most were saved by a Living God, who protected them until Orlanth and Ernalda eventually returned."
      :options [
        {:title "We hid inside Brastalos, the No Wind, so the monsters could not find us." :modifiers {}}
        {:title "We strapped the bones of our dead fathers on our feet, and escaped from the monsters by skating on the ice." :modifiers {}}
        {:title "We dug a hole in the ground and huddled inside, kept alive by the warmth of our sleeping kinsmen." :modifiers {}}
        {:title "A star captain fell screaming from the sky, and his light led us safely through the Darkness." :modifiers {}}
      ]}
      ;; TODO  13. I Fought We Won
      {:title "14. The Unity Council"
       :query "Which allies were most important to you?"
       :description "King Heort guided your people out of the Great Darkness. He reinstituted sacrifice to the gods, organized the peoples into clans, gave out the new laws for society, and arranged the first new tribe. In his honor, you became Heortlings. He also arranged alliances with all the nearby Elder Races and formed the Unity Council. For the first time ever, humans and the elder races worked cooperatively. During this time of peace and cooperation, your ancestors made many unexpected allies.\n The Unity Council of Dragon Pass was a unique and extraordinary phenomenon. Many ancient feuds and hostilities were set aside for the sake of harmony. The unity allowed the peoples to cast off Chaos and to thrive in comparison with the rest of the miserable Darkness-plagued world.\n You cannot choose the same answer as you did for your Ancient Enemy. Your hostility to that enemy blinded you to the advantages of the new age."
      :options [
        {:title "The elves, who taught you to call them Aldryami." :modifiers {}}
        {:title "The Mostali, whom you had previously called dwarves." :modifiers {}}
        {:title "The trolls, who now wanted you to call them Uz." :modifiers {}}
        {:title "The nomads of Prax, who had always raided our lands, but who shared common deities and hatred of Chaos." :modifiers {}}
        {:title "The dragonewts, who served the monstrous dragons in their unfathomable and alien ways, but feared Chaos as did you." :modifiers {}}
      ]}
     {:title "15. The Heortlings"
      :query "Which Heortling Tribe did your clan belong to?"
      :description "Under King Heort's leadership the clans prospered and soon his Heortling Tribe became many tribes. There are eleven ancestral Heortling Tribes. Everyone knows which one they belonged to during the Dawn Age, even though none of them exists any longer."
      :options [
        {:title "We belonged to the Vestantes, the tribe of one of the Summer Daughters Vestene and her foreigner husband Goralf Brown. We lived in the north, in the lands now called Aggar." :modifiers {}}
        {:title "We belonged to the Koroltes, the tribe of the Summer Son, Korol. We lived near Kero Fin in the lands later stolen by the Grazelanders." :modifiers {}}
        {:title "We belonged to the Ogorvaltes, the tribe of one of the Summer Daughters, Orgorvale and her outlander husband Ulanin the Rider. We lived in the lands now called Sartar." :modifiers {}}
        {:title "We belonged to the Penentelli, the tribe of the Winter Daughter, Penene, and her husband Kastwall Five. We lived in the highlands of the lands now called Aggar." :modifiers {}}
        {:title "We belonged to the Infithtelli, the tribe of one of the Summer Daughters, Infithe and her husband Porscriptor the Cannibal. We lived in the land now called Tarsh." :modifiers {}}
        {:title "We belonged to Berenethtelli, the tribe of the Red-Haired Winter Daughter Redaylde and her horse-loving husband Bereneth the Rider. We lived in the north, in the land now called Saird." :modifiers {}}
        {:title "We joined the Liornvuli, named for Liorn the Young, star husband of Deleen daughter of King Kodig, the eldest son of Vingkot. We lived in the land now called Tarsh." :modifiers {}}
        {:title "We joined the Forosilvuli, named for Forosil Ferocious, star husband of Ornore Korolsdottir. We lived in the land now called Tarsh." :modifiers {}}
        {:title "We joined the Stravuli, named for Stravul, the great hero who defended Dragon Pass in the Darkness. We lived in the lands now called Tarsh." :modifiers {}}
        {:title "We joined the Garanvuli, named for Garan, star lover of Serias, who defeated the Chaos Army and saved his lover at Whitewall. We lived in the lands now called Heortland." :modifiers {}}
        {:title "We joined the Sedenorvuli, named for Sedenor who descended to save his clan from Chaos. We lived in the land just north of the Shadow Plateau and feuded with the Koroltes until we were forced to move to the far north to a land now called Talastar." :modifiers {}}
      ] ;; TODO separate questions to two groups
     }
     {:title "16. The Era of Time"
      :query "What deity did your clan help awaken?"
      :description "While the rest of society worked to protect, feed, and just survive, the First Priests worked to re-establish links with the ancient deities. A new harmony between people and deities was made and the world was slowly improved. The gods returned from the Underworld with the First Dawn. Time and history began."
      :options [
        {:title "Our ancestors, we did not need more." :modifiers {}}
        {:title "Ernalda, the Mother Goddess." :modifiers {}}
        {:title "Orlanth, the AllFather." :modifiers {}}
        {:title "Lhankor Mhy, the Knowing God." :modifiers {}}
        {:title "Issaries, the Talking God." :modifiers {}}
        {:title "Chalana Arroy, the Healing Goddess." :modifiers {}}
        {:title "Heler, the Rain-bringing God." :modifiers {}}
        {:title "Elmal, the Suffering Sun." :modifiers {}}
        {:title "Kolat, the Spirit Wind." :modifiers {}}
        {:title "Storm Bull, the Mindless Storm." :modifiers {}}
        {:title "Humakt, the Lord of Death." :modifiers {}}
        {:title "Yinkin, the Alynx God." :modifiers {}}
        {:title "Lady of the Wild." :modifiers {}}
        {:title "Odayla, the Hunting God." :modifiers {}}
        {:title "Argan Argar, the Speaker in Darkness." :modifiers {}}
      ]
    }
      {:title "17. Lokamayadon"
       :query "How did your clan resist Lokamayadon?"
       :description "Orlanth always encouraged personal ambition. No one thought there could be too much personal advancement until a priest named Lokamayadon took upon himself the powers of High Storm. He tried to replace Orlanth, peacefully at first and then by killing all who worshipped the God.\n Many people went along with him because he was powerful, but most Orlanthi resisted, though it cost them greatly. Now everyone hates \"Lokomoko,\" who was revealed as a Chaos god."
       :options [
        {:title "Fought ceaselessly, no matter how many of us were killed." :modifiers {}}
        {:title "Fought the High Storm people when it was safe to do so." :modifiers {}}
        {:title "Pretended to go along with High Storm, and waited for a good time to rebel." :modifiers {}}
        {:title "We could not help ourselves; we were forced to follow him." :modifiers {}}
        {:title "We followed Lokomo because we did not know it was wrong." :modifiers {}}
       ]}
       {:title "18. Arkat the Liberator"
        :query "What did your clan do when Arkat came?"
        :description "Lokamayadon helped create a new god called Gbaji, which brought Chaos back. It would have destroyed the world except that the great hero Harmast Barefoot performed the Lightbringers Quest and brought back the destroyer of Gbaji."
        :options [
          {:title "Raised all our forces to fight." :modifiers {}}
          {:title "Sent as many men as we could spare, but no more." :modifiers {}}
          {:title "Waited to see what would happen, then helped when we were sure he would win." :modifiers {}}
          {:title "Neither helped nor hindered." :modifiers {}}
        ]}
        {:title "Arkat the Traitor"
         :query "How do you feel about Arkat's betrayal?"
         :description "Arkat was the destroyer. He was a man who had lived before, a sorcerous demon in the shape of a man, or maybe just a trickster. Arkat helped everyone, then betrayed them. He deserted his army when it fought Dara Happa and he finally even left Harmast in the clutches of his worst foe, so that he could betray the whole human race and become a troll. Everyone hates Arkat, even though he destroyed Gbaji and saved the world. It does not matter what fate your clan suffered at his hands, they suffered, but survived, and that is all anyone needs to remember."
        :options [
          {:title "Our honor was terribly offended and we demanded vengeance." :modifiers {}}
          {:title "Offended, but we still worked with him against Gbaji." :modifiers {}}
          {:title "We did not care, he is still a hero." :modifiers {}}
          {:title "He did not become a troll, not Arkat!" :modifiers {}}
          {:title "Our clan has little interest in Arkat one way or another." :modifiers {}}
        ]}
        {:title "19. The Empire of Wyrms Friends"
         :query "What was your attitude towards the dragons?"
         :description "During the Second Age, a dragon approached you, in either its own form or that of a human with the soul of a dragon. The dragons had always been hostile, or at the very best utterly uncaring, but now it offered to share knowledge with you. Orlanth has always been the dragon-slayer, but many priests of other clans embraced these new ways and formed the EWF, the Empire of Wyrms Friends. Your clan did not, or you would not be here now."
         :options [
          {:title "Hostile, we fought against them." :modifiers {}}
          {:title "Negative, we resisted them, for we would never believe a dragon." :modifiers {}}
          {:title "Suspicious, we did not go along." :modifiers {}}
         ]}
         {:title "20. The Dragonkill War"
          :query "What lesson did your clan draw from the Dragonkill?"
          :description "The EWF was corrupted by the dragons and finally destroyed when the dragonewts killed its leaders.\n Afterwards, several great armies invaded Dragon Pass from the north, east, and south. After decades of warfare, hundreds of dragons (including the great dragons) appeared, some as big as the sky, and ate every human being they found, hostile or otherwise. A few incredibly lucky people survived, said to number only ten humans. Any hatred people had for the dragons was replaced by unconquerable fear."
          :options [
            {:title "Never try things that go against Orlanth's way." :modifiers {}}
            {:title "Kings should rule, because priests make errors when they try to lead people." :modifiers {}}
            {:title "New things are usually bad." :modifiers {}}
            {:title "Knowledge itself is not harmful, only the way it is used." :modifiers {}}
            {:title "Be careful when making friends." :modifiers {}}
            {:title "Dragons are evil." :modifiers {}}
            {:title "It was lucky that we lived in Heortland at the time." :modifiers {}}
          ]
       }
       ])
