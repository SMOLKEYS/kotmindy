package com.github.smol.kotmindy.mindustry.events

import mindustry.game.EventType.*
import com.github.smol.kotmindy.arc.events.*

//TODO only defines common events

fun win(cons: WinEvent.() -> Unit) = on<WinEvent>(cons)

fun lose(cons: LoseEvent.() -> Unit) = on<LoseEvent>(cons)

fun resize(cons: ResizeEvent.() -> Unit) = on<ResizeEvent>(cons)

fun mapMake(cons: MapMakeEvent.() -> Unit) = on<MapMakeEvent>(cons)

fun mapPublish(cons: MapPublishEvent.() -> Unit) = on<MapPublishEvent>(cons)

fun saveWrite(cons: SaveWriteEvent.() -> Unit) = on<SaveWriteEvent>(cons)

fun clientCreate(cons: ClientCreateEvent.() -> Unit) = on<ClientCreateEvent>(cons)

fun serverLoad(cons: ServerLoadEvent.() -> Unit) = on<ServerLoadEvent>(cons)

fun dispose(cons: DisposeEvent.() -> Unit) = on<DisposeEvent>(cons)

fun play(cons: PlayEvent.() -> Unit) = on<PlayEvent>(cons)

fun reset(cons: ResetEvent.() -> Unit) = on<ResetEvent>(cons)

fun host(cons: HostEvent.() -> Unit) = on<HostEvent>(cons)

fun wave(cons: WaveEvent.() -> Unit) = on<WaveEvent>(cons)

fun turn(cons: TurnEvent.() -> Unit) = on<TurnEvent>(cons)

fun lineConfirm(cons: LineConfirmEvent.() -> Unit) = on<LineConfirmEvent>(cons)

fun turretAmmoDeliver(cons: TurretAmmoDeliverEvent.() -> Unit) = on<TurretAmmoDeliverEvent>(cons)

fun coreItemDeliver(cons: CoreItemDeliverEvent.() -> Unit) = on<CoreItemDeliverEvent>(cons)

fun blockInfo(cons: BlockInfoEvent.() -> Unit) = on<BlockInfoEvent>(cons)

fun contentInit(cons: ContentInitEvent.() -> Unit) = on<ContentInitEvent>(cons)

fun clientLoad(cons: ClientLoadEvent.() -> Unit) = on<ClientLoadEvent>(cons)

fun musicRegister(cons: MusicRegisterEvent.() -> Unit) = on<MusicRegisterEvent>(cons)

fun fileTreeInit(cons: FileTreeInitEvent.() -> Unit) = on<FileTreeInitEvent>(cons)

fun worldLoad(cons: WorldLoadEvent.() -> Unit) = on<WorldLoadEvent>(cons)

fun worldLoadBegin(cons: WorldLoadBeginEvent.() -> Unit) = on<WorldLoadBeginEvent>(cons)

fun worldLoadEnd(cons: WorldLoadEndEvent.() -> Unit) = on<WorldLoadEndEvent>(cons)

fun saveLoad(cons: SaveLoadEvent.() -> Unit) = on<SaveLoadEvent>(cons)

fun sectorLose(cons: SectorLoseEvent.() -> Unit) = on<SectorLoseEvent>(cons)

fun sectorInvasion(cons: SectorInvasionEvent.() -> Unit) = on<SectorInvasionEvent>(cons)

fun launchItem(cons: LaunchItemEvent.() -> Unit) = on<LaunchItemEvent>(cons)

fun sectorLaunch(cons: SectorLaunchEvent.() -> Unit) = on<SectorLaunchEvent>(cons)

fun blockDestroy(cons: BlockDestroyEvent.() -> Unit) = on<BlockDestroyEvent>(cons)

fun blockBuild(cons: BlockBuildEvent.() -> Unit) = on<BlockBuildEvent>(cons)

fun unitDestroy(cons: UnitDestroyEvent.() -> Unit) = on<UnitDestroyEvent>(cons)

fun unitCreate(cons: UnitCreateEvent.() -> Unit) = on<UnitCreateEvent>(cons)

fun unitControl(cons: UnitControlEvent.() -> Unit) = on<UnitControlEvent>(cons)

fun withdraw(cons: WithdrawEvent.() -> Unit) = on<WithdrawEvent>(cons)

fun deposit(cons: DepositEvent.() -> Unit) = on<DepositEvent>(cons)

fun tap(cons: TapEvent.()) = on<TapEvent>(cons)